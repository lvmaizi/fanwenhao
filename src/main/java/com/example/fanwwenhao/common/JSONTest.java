package com.example.fanwwenhao.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class JSONTest {
    public static void main(String[] args) throws ClassNotFoundException {
        JSONObject jsonObject = new JSONObject();
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
