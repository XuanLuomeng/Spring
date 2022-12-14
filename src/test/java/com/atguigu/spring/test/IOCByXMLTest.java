package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {

    /**
     * 获取bean的三种方式
     * 1、根据bean的id获取
     * 2、根据bean的类型获取（常用）
     * 注意：根据类型获取bean时，要求ioc容器中有且只有一个类型匹配的bean
     * 若没有任何一个类型类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
     * 若没有任何多个类型类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
     * 3、根据bean的id和类型获取（推荐但不常用）
     * 注意：根据接口类型获取bean时，要求ioc容器中有且只有唯一bean
     * 结论：
     * 根据类型来获取bean时，在满足bean唯一的前提下
     * 其实只看：【对象 instanceof 指定的类型】的返回结构
     * 只要返回的是true就可以认定为和类型匹配，能够获取到
     * 即通过bean的类型，bean所继承的类的类型、bean所实现的接口的类型都可以获取bean
     */

    @Test
    public void testDITwo(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
//        Student student = ioc.getBean("studentFive", Student.class);
//        System.out.println(student);
//        Class clazz = ioc.getBean("clazzInner", Class.class);
//        System.out.println(clazz);
//        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
//        System.out.println(clazzOne);
        Student student = ioc.getBean("studentSix", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        Student student = ioc.getBean("studentTwo", Student.class);
        System.out.println(student);
    }

    @Test
    public void testIOC(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        //Student studentOne = (Student) ioc.getBean("studentOne");
        //Student student = ioc.getBean(Student.class);
        Student student = ioc.getBean("studentOne", Student.class);
        System.out.println(student);
        System.out.println(student.getClass().getName());
    }
}
