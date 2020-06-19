package com.example.fanwwenhao;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Date 2020/6/10 17:58
 * @Version 1.0
 */
public class SpringTest {
    @Test
    public void springTest(){
        System.out.println(Math.random());
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        MySpring mySpring = (MySpring) context.getBean("mySpring");
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));
        MySpring mySpring = (MySpring) bf.getBean("mySpring");
        mySpring.sayHello();
        System.out.println("234");
    }
}
