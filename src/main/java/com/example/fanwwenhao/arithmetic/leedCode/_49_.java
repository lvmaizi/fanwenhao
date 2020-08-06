package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.*;

public class _49_ {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap();
        for (int i = 0;i < strs.length; i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String ss = String.valueOf(s);
            if(map.keySet().contains(ss)){
                map.get(ss).add(strs[i]);
            }else {
                List list = new ArrayList();
                list.add(strs[i]);
                map.put(ss,list);
            }
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        List l = new _49_().groupAnagrams(new String[]{"abc","cab","dca"});
        System.out.println("");
    }
}
