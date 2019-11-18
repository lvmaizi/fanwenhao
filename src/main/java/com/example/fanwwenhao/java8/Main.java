package com.example.fanwwenhao.java8;
class MethodI {
    public static void hello() {
        System.out.println("hahaha");
    }
}
public class Main {
    public static void main(String[] args) {
        test(MethodI::hello);
        test(()-> System.out.println("xixiix"));
    }
    static void test(Method m){
        m.test();
    }
}
