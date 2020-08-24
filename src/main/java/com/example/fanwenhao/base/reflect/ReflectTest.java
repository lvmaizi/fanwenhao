package com.example.fanwenhao.base.reflect;


import java.lang.reflect.Method;

/**
 * @Date 2020/5/13 11:46
 * @Version 1.0
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        Class c = Person.class;
        Person person = new Person();
        Method method0 = c.getMethod("publicMethod");
        method0.invoke(person);

        Method method1 = c.getDeclaredMethod("privateMethod");
        method1.setAccessible(true);
        method1.invoke(person);

        person.publicMethod();
    }
}
