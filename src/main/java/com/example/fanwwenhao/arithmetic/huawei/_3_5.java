package com.example.fanwwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * @Date 2020/7/14 16:42
 * @Version 1.0
 */
public class _3_5 {
    public static void main(String[] args) throws IOException {
        int k = 4,n = 4;
        List list = new LinkedList();
        for (int i=1;i<=k;i++){
            list.add(i);
        }
        StringBuffer result =  new StringBuffer();
        n--;
        for (int i=0;i<k-1;i++){
            //找到当前位的序号
            int a = n/cal(k-i-1);
            result = result.append(list.remove(a));
            n = n % cal(k-i-1);
        }
        result = result.append(list.get(0));
        System.out.println(result);
    }
    private static int cal(int n){
        int result = 1;
        while (n>0){
            result = result * n;
            n--;
        }
        return result;
    }
    private static int  remove(List<Integer> list,int target){
        for (int i=0;i<list.size();i++){
            if(list.get(i)==target){
                return list.remove(i);
            }
        }
        return 0;
    }

}
