package com.atguigu.spring.pojo;

import lombok.Data;

import java.util.Arrays;
import java.util.Map;

@Data
public class Student {
    private Integer sid;
    private String sName;
    private Integer age;
    private String gender;
    private Double score;
    private String[] hobby;
    private Clazz clazz;
    private Map<String,Teacher>  teacherMap;

    public Student() {
    }

    public Student(Integer sid, String sName, String gender, Integer age) {
        this.sid = sid;
        this.sName = sName;
        this.age = age;
        this.gender = gender;
    }

    public Student(Integer sid, String sName, String gender, Double score) {
        this.sid = sid;
        this.sName = sName;
        this.score = score;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", hobby=" + Arrays.toString(hobby) +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
