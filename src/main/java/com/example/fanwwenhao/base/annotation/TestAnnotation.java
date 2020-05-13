package com.example.fanwwenhao.base.annotation;

import java.lang.annotation.Annotation;

/**
 * @Date 2020/5/8 9:58
 * @Version 1.0
 */
@FanAnnotation(name = "1",isNan = false)
public class TestAnnotation {
    public static void main(String[] args) {
        TestAnnotation testAnnotation = new TestAnnotation();
        Class class1 = testAnnotation.getClass();
        for (Annotation annotation: class1.getAnnotations()){
            System.out.println(annotation.annotationType());
            System.out.println(((FanAnnotation)annotation).name());
        }
        System.out.println(class1.getAnnotations());
    }
}
