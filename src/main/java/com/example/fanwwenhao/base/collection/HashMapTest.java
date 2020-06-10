package com.example.fanwwenhao.base.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Date 2020/6/2 16:01
 * @Version 1.0
 */
public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("");
        HashMap hashMap = new HashMap();
        hashMap.put(new A(1),"fanwenhao");
        for (int i=1;i<=11;i++){
            hashMap.put(new A(4),"++");
        }
        hashMap.put(new A(4),"fengyunfei");

        hashMap.put(new A(2),"fengyunfei");

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("s","s");

    }
    static class A {
        int v;
        A(int v){
            this.v = v;
        }
        @Override
        public int hashCode(){
            if(v == 0)return 1;
            if(v == 1)return 1;
            return super.hashCode();
        };
    }
}
