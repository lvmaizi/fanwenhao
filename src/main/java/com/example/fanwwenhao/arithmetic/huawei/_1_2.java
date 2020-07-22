package com.example.fanwwenhao.arithmetic.huawei;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/22 14:18
 * @Version 1.0
 */
//反转文章片段
public class _1_2 {
    public static void main(String[] args) {
        String str = "  I am a developer.";
        int start = 1,end = 2;
        StringBuffer rs = new StringBuffer();
        System.out.println(rs);
        int num = -1;
        String[] ss = str.split(" ");
        for (int i=0;i<ss.length;i++){
            if(!"".equals(ss[i])){
                num ++;
            }
            if(num>=start && num<=end){
                rs.insert(0,ss[i]+" ");
            }
            if(num>end)break;
        }
        System.out.println(rs.toString().trim());

    }
}
