package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Person;
import com.atguigu.ssm.service.PersonService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description:
 * @author: wangyan
 * @deteTime: 2022/9/25-11:09
 */
@Controller
public class HelloController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = "/getAllPerson",method = RequestMethod.POST)
    public String addPerson(Person person,Integer pages){
        personService.addPerson(person);
        PageInfo<Person> page = personService.getAllPersonToPage(pages);
        return "redirect:/getAllPerson/" + (page.getPages());
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.GET)
    public String jumpToaddPerson(Integer pages,Model model){
        model.addAttribute("pages",pages);
        return "addPerson";
    }

    @RequestMapping(value = "/getAllPerson",method = RequestMethod.PUT)
    public String update(Person person,Integer pageNum){
        personService.update(person);
        return "redirect:/getAllPerson/" + pageNum;
    }
    @RequestMapping(value = "/jumpToUpdate",method = RequestMethod.POST)
    public String update(Integer id,Integer pageNum,Model model){
        Person person = personService.getPersonById(id);
        model.addAttribute("person",person);
        System.out.println(person);
        model.addAttribute("pageNum", pageNum);
        return "update";
    }

    @RequestMapping(value = "/getAllPerson",method = RequestMethod.DELETE)
    public String delete(Integer id,Integer pageNum){
        personService.deleteByid(id);

        return "redirect:/getAllPerson/" + pageNum;
//        return "index";
    }

    @RequestMapping(value = "/getAllPerson/{pageNum}", method = RequestMethod.GET)
    public String getAllPerson(Model model, @PathVariable("pageNum") Integer pageNum){
        PageInfo<Person> page = personService.getAllPersonToPage(pageNum);
        model.addAttribute("page",page);
        return "allPerson";
    }

//    @RequestMapping(value = "/getAllPerson", method = RequestMethod.GET)
//    public String getAllPerson(Model model){
//        List<Person> list = personService.getAllPerson();
//        model.addAttribute("list",list);
//        return "allPerson";
//    }
}
