package com.atguigu.spring.test;

import com.atguigu.spring.pojo.HelloWord;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void test() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean对象
        HelloWord helloWord = (HelloWord) ioc.getBean("helloWord");
        helloWord.sayHello();
    }
}
