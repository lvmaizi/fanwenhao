package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/22 15:59
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 目录删除
 */
public class _1_7 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("8 6");
        list.add("10 8");
        list.add("6 0");
        list.add("20 8");
        list.add("2 6");
        int deleteNode = 8;
        dfs(list,deleteNode);
        System.out.println(list);
    }
    private  static void dfs(List list,int deleteNode){
        for (int i=0;i<list.size();i++){
            if("".equals(list.get(i)))continue;
            String s = (String) list.get(i);
            if(Integer.parseInt(s.split(" ")[0])==deleteNode){
                list.set(i,"");
            }
            if(Integer.parseInt(s.split(" ")[1])==deleteNode){
                list.set(i,"");
                dfs(list,Integer.parseInt(s.split(" ")[0]));
            }
        }
    }
}
