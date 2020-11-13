package com.example.javadoc;

/**
 * JavaDocExample类概要略
 * @since 1.1
 * {@link JavaDoc2}
 * @see JavaDoc2
 * @author fwh
 * @version 1.0
 *
 */
public class JavaDocExample {

    /**
     * 属性
     */
    public String filed;

    /**
     * 方法概要：略
     * @throws NullPointerException
     * @param args 参数名
     * @return 返回描述
     */
    public String method(String args) {
        return "hello method";
    }
}
