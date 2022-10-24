package com.atguigu.spring.test;

import com.atguigu.spring.controller.StudentController;
import com.atguigu.spring.dao.StudentDao;
import com.atguigu.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {

    /**
     * xml中设置context:component-scan作为扫描器
     * context:exclude-filter:排除扫描
     * type:设置排除扫描的方式
     * type:"annotation|assignable"
     * annotation:根据注解的类型进行排除，expression需要设置排除的注解的全类名
     * assignable:根据类的类型进行排除，expression需要设置排除的注解的全类名
     * context:include-filter:包含扫描
     * 注意：需要在context:component-scan标签中设置use-default-filters="false"
     * use-default-filters="true"（默认），所设置的包下所有的类都需要扫描，此时可以使用排除扫描
     * use-default-filters="false"，所设置的包下所有的类都不需要扫描，此时可以使用包含扫描
     *
     * @Component:将类标识为普通组件()
     * @Controller:将类标识为控制层组件(controller)
     * @Service:将类标识为业务层组件(service)
     * @Repository:将类标识为持久层组件(dao)
     *
     * 通过注解+扫描所配置的bean的id，默认值为类的小驼峰，即类名的首字母为小写的结果
     * 可以通过表示组件的注解的value属性值设置bean的自定义的id
     */

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        StudentController studentController = ioc.getBean(StudentController.class);
        System.out.println(studentController);
        StudentService studentService = ioc.getBean(StudentService.class);
        System.out.println(studentService);
        StudentDao studentDao = ioc.getBean(StudentDao.class);
        System.out.println(studentDao);
    }
}
