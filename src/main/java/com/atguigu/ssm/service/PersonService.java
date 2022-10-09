package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Person;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: wangyan
 * @deteTime: 2022/9/25-12:55
 */
public interface PersonService {
    List<Person> getAllPerson();

    PageInfo<Person> getAllPersonToPage(Integer pageNum);


    void deleteByid(Integer id);

    void update(Person person);

    Person getPersonById(Integer id);

    void addPerson(Person person);

}
