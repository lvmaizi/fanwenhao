package com.example.fanwenhao;

public class ClassLoadTest {
    public static void main(String[] args) {
        System.out.println("ClassLodarDemo's ClassLoader is " + ClassLoadTest.class.getClassLoader());
        System.out.println("The Parent of ClassLodarDemo's ClassLoader is " + ClassLoadTest.class.getClassLoader().getParent());
        System.out.println("The GrandParent of ClassLodarDemo's ClassLoader is " + ClassLoadTest.class.getClassLoader().getParent().getParent());
//        AppClassLoader appClassLoader;
//        ExtClassLoader extClassLoader;
        ClassLoader classLoader;
    }
}
