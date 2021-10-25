package com.xian.spring.domain;

import java.util.Date;

public class User {
    private String name;
    private Integer age;
    private String male;
    private Date birthday;

    public void init(){
        System.out.println("User is init....");
    }

    public void destroy(){
        System.out.println("User is destroy....");
    }

    public void save(){
        System.out.println("save method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male='" + male + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
