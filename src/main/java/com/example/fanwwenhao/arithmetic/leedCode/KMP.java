package com.example.fanwwenhao.arithmetic.leedCode;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Date 2020/4/28 16:03
 * @Version 1.0
 */
public class KMP {
    //PMT
    static int[] getKMP(char[] p){
        int[] kmp = new int[p.length];
        int i=1,j=0;
        while (i<p.length){
            if (p[i]==p[j]){
                kmp[i]=j+1;
                i++;
                j++;
            }else {
                i++;
                j=0;
            }
        }
        return kmp;
    }
    //是否匹配成功
    static int kmp(char[] s,char[] p,int [] pmt){
        if (p.length==s.length && p.length ==0)return 0;
        int i=0,j=0;
        while (i<s.length){
            //if(j==p.length-1)return true;
            if (s[i]==p[j]){
                if(j==p.length-1)return i-j;
                i++;
                j++;
            }else {
                if(j>0)
                    j=pmt[j-1];
                else {j=0;i++;}

            }
        }
        return -1;
    }
    public int strStr(String haystack, String needle) {
        int[] kmp = getKMP(needle.toCharArray());
        return kmp(haystack.toCharArray(), needle.toCharArray(), kmp);

    }
    public static void main(String[] args) throws ParseException {
//        char[] s = {'a','b','a','b','a','b','a','b','c','a'};
//        char[] p = {'a','b','a','b','a','b','c','a'};

        StringBuilder buf = new StringBuilder();
        buf.append(":");
        System.out.println(buf.toString());
        char[] s = {};
        char[] p = {};
        int[] kmp = getKMP(p);
        System.out.println(kmp(s, p, kmp));
    }
}
