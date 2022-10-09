package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Person;

import java.util.List;

/**
 * @Description:
 * @author: wangyan
 * @deteTime: 2022/9/25-11:27
 */
public interface PersonMapper {
    List<Person> getAllPerson();

    void deleteByid(Integer id);

    void update(Person person);

    Person getPersonById(Integer id);

    void addPerson(Person person);
}
