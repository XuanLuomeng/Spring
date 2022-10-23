package com.atguigu.spring.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer sid;
    private String sName;
    private Integer age;
    private String gender;

    public Student() {
    }

    public Student(Integer sid, String sName, Integer age, String gender) {
        this.sid = sid;
        this.sName = sName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
