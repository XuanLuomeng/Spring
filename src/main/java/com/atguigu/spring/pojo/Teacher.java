package com.atguigu.spring.pojo;

import lombok.Data;

@Data
public class Teacher {
    private Integer tid;
    private String tName;

    public Teacher(){}

    public Teacher(Integer tid, String tName) {
        this.tid = tid;
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                '}';
    }
}
