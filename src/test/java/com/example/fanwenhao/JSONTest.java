package com.example.fanwenhao;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;


import java.util.*;

public class JSONTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("PDA","2");
        map.put("P",jsonObject);
        List rs= new ArrayList();
        rs.add(null);
        System.out.println(map.containsKey(null));
        System.out.println(new JSONPath("P.PD.E.F").eval(map));
        Date d = new Date();
        d.after(null);
    }
}
