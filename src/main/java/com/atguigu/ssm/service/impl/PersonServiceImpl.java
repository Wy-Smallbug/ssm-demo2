package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.PersonMapper;
import com.atguigu.ssm.pojo.Person;
import com.atguigu.ssm.service.PersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: wangyan
 * @deteTime: 2022/9/25-12:55
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;



    public List<Person> getAllPerson(){
        List<Person> list = personMapper.getAllPerson();
        return list;
    }
    public Person getPersonById(Integer id){
        return personMapper.getPersonById(id);
    }

    @Override
    public void addPerson(Person person) {
        personMapper.addPerson(person);
    }

    @Override
    public PageInfo<Person> getAllPersonToPage(Integer pageNum) {

        PageHelper.startPage(pageNum,4);

        List<Person> list = personMapper.getAllPerson();
        PageInfo<Person> page = new PageInfo<Person>(list,5);
        return page;
    }

    @Override
    public void deleteByid(Integer id) {
        personMapper.deleteByid(id);
    }

    @Override
    public void update(Person person) {
        personMapper.update(person);
    }
}
