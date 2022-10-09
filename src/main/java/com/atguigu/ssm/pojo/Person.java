package com.atguigu.ssm.pojo;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: wangyan
 * @deteTime: 2022/9/25-12:41
 */
@Component
public class Person {
    private Integer id;
    private String pName;
    private Integer age;
    private String sex;

    public Person() {
    }

    public Person(Integer id, String pName, Integer age, String sex) {
        this.id = id;
        this.pName = pName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + id +
                ", pName='" + pName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
