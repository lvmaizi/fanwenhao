package com.example.fanwwenhao.base.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.ServiceLoader;

/**
 * @Date 2020/5/9 14:04
 * @Version 1.0
 */
public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<Person> serviceLoader = ServiceLoader.load(Person.class);
        serviceLoader.forEach(Person::sayHello);
        System.out.println("ss");
        ExtensionLoader<Person> extensionLoader =
                ExtensionLoader.getExtensionLoader(Person.class);
        Person personOne = extensionLoader.getExtension("personOne");
        personOne.sayHello();
    }
}
