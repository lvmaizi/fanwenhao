package com.example.fanwwenhao.arithmetic.huawei;

import java.util.*;

/**
 * @Date 2020/7/22 10:46
 * @Version 1.0
 */
public class _4_10 {
    private static int[] rs;
    public static void main(String[] args) {
        String[] s = {"1,2","2,4","4,3"};
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(",")[0])-Integer.parseInt(o2.split(",")[0]);
            }
        });
        rs = new int[s.length+1];
        for (int i=1;i<rs.length;i++){
            rs[i] = dfs(s,i+1,i+1);
        }

        for (int a:rs){
            System.out.println(a);
        }

    }
    //求所有排名高于index的徒弟和子徒弟
    private static int dfs(String[] s,int index,int root){
        int num = 0;
        for (int i=0;i<s.length;i++){
            if(Integer.parseInt(s[i].split(",")[0]) == index){
                if(Integer.parseInt(s[i].split(",")[1])<root){
                    num++;
                }
                num = num + dfs(s,Integer.parseInt(s[i].split(",")[1]),root);
            }
        }
        return num;
    }
}
