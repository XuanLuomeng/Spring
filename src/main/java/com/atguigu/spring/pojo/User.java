package com.atguigu.spring.pojo;

import lombok.Data;

public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    public User(){
        System.out.println("生命周期1：实例化");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("生命周期2：依赖注入");
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public User(Integer id, String userName, String password, Integer age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public void initMethod(){
        System.out.println("生命周期3：初始化");
    }

    public void destroyMethod(){
        System.out.println("生命周期4：销毁");
    }
}
