package com.example.fanwwenhao.arithmetic.huawei;

import java.util.*;

/**
 * @Date 2020/7/23 18:40
 * @Version 1.0
 */
public class _5_6 {
    public static void main(String[] args) {
        int[] input = new int[]{2,3,4};
        Arrays.sort(input);
        List<Integer> list = new LinkedList();
        for (int i:input){
            list.add(i);
        }
        List result = new ArrayList();
        while (list.size()>0){
            List l = new ArrayList();
            Iterator i = list.iterator();
            int min = (int) i.next();
            l.add(min);
            while (i.hasNext()){
                int a = (int) i.next();
                if(a%min == 0){
                    l.add(a);
                    i.remove();
                }
            }
            result.add(l);
        }
    }
}
