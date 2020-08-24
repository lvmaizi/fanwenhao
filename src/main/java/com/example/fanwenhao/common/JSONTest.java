package com.example.fanwenhao.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class JSONTest {
    static class Domain{
        private String a;
        private Integer b;
        private String c;
        private BigDecimal bigDecimal;
        private Double d;

        public Double getD() {
            return d;
        }

        public void setD(Double d) {
            this.d = d;
        }

        public BigDecimal getBigDecimal() {
            return bigDecimal;
        }

        public void setBigDecimal(BigDecimal bigDecimal) {
            this.bigDecimal = bigDecimal;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public Integer getB() {
            return b;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {


        String json = "{\n" +
                "\t\"a\": \"1\",\n" +
                "\t\"b\": \"2\",\n" +
                "\t\"d\": \"10.0198767586890\"\n" +
                "}";
        Domain domain = JSONObject.parseObject(json,Domain.class);

        JSONObject jsonObject = new JSONObject();

        Domain domain1 = new Domain();
        domain1.setBigDecimal(new BigDecimal(10.01));
        domain1.setD(new Double("1.01"));

        System.out.println(JSON.toJSONString(domain1));


        jsonObject.put("fanwenhao","");
        Map map = new HashMap<>();
        Map map1 = new HashMap<>();
        map.put("fanwenhao",map1);
        JSONPath jsonPath = new JSONPath("fanwenhao.name");
        jsonPath.set(map,"hello");
        System.out.println("kk");

        System.out.println(JSON.toJSONString(map));
        Class c = map.getClass();
        Class a = Map.class;
        Class b = Class.forName("java.util.Map");

        System.out.println(c.getName());
    }
}
