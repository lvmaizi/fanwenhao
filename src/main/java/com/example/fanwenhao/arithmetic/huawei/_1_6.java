package com.example.fanwenhao.arithmetic.huawei;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Date 2020/7/22 15:24
 * @Version 1.0
 */
//面试
public class _1_6 {
    public static void main(String[] args) {
        int max = 5;
        List list = new ArrayList();
        list.add("1,2");
        list.add("1,3");
        list.add("2,4");
        list.add("4,5");
        list.add("5,6");
        int rs = 0;
        while (list.size()>0){
            remove(list,max);
            rs++;
        }
        System.out.println(rs);
    }
    //取出不重叠的区间，最多取max
    private static void remove(List<String> list,int max){
        int num = 0;
        int interView = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            if(Integer.parseInt(s.split(",")[0]) > interView){
                num++;
                interView = Integer.parseInt(s.split(",")[1]);
                iterator.remove();
            }
            if(num==max)return;
        }
    }
}
