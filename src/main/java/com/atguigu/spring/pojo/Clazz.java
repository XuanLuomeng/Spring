package com.atguigu.spring.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Clazz {
    private Integer clazzId;
    private String name;
    private List<Student> list;

    public Clazz(){}

    public Clazz(Integer clazzId, String name) {
        this.clazzId = clazzId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
