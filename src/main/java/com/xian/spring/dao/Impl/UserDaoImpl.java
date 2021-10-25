package com.xian.spring.dao.Impl;

import com.xian.spring.dao.UserDao;
import com.xian.spring.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Xian
 */
public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;
    private String name;
    private Integer age;

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void save() {
        /*System.out.println(this.age+","+this.name);*/
        System.out.println(this.properties);
        System.out.println(this.userMap);
        System.out.println(this.strList);
        System.out.println("save method...");
    }
}
