package com.soft.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2020/2/12.
 */
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(Integer id, String username, String password, Integer age, Date birthday) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
    }

    public User() {

    }
}
