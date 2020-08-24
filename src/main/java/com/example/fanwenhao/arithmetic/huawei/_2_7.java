package com.example.fanwenhao.arithmetic.huawei;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class _2_7 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Comparator comparator = (o1, o2) -> {
            return getNumber((String) o1)-getNumber((String) o2);
        };
        list.add("wr0068");
        list.add("lt01");
        list.add("qhy0027828");
        list.add("gh20425256");
        list.add("xj0033258");
        list.add("zmj00505562");

        Collections.sort(list,comparator);
        System.out.println(list);

    }
    public static int getNumber(String s){
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) > '0' && s.charAt(i)<='9'){
                return Integer.parseInt(s.substring(i,s.length()));
            }
        }
        return 0;
    }
}
