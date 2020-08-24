package com.example.fanwenhao.arithmetic.leedCode;

import java.text.ParseException;

/**
 * @Date 2020/4/28 16:03
 * @Version 1.0
 */
public class KMP {
    //PMT
    static int[] getPMT(char[] p){
        int[] next = new int[p.length];
        //递推解决：求next[i] 假设0到i-1均成功求出
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j<p.length-1){
            if(k==-1 || p[j]==p[k]){
                next[++j] = ++k;
            }else {
                k= next[k];
            }
        }
        return next;
    }
    //是否匹配成功
    static int kmp(char[] s,char[] p,int [] next){
        int i=0,j=0;
        while (i<s.length && j<p.length){
            if(j==-1 || s[i] == p[j]){
                if(j == p.length-1)return i-j;
                i++;
                j++;
            }else {
                j=next[j];
            }
        }
        return -1;
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        if (0==haystack.length() || needle.length() ==0)return -1;
        int[] kmp = getPMT(needle.toCharArray());
        return kmp(haystack.toCharArray(), needle.toCharArray(), kmp);

    }
    public static void main(String[] args) throws ParseException {
        char[] s = {'a','b','a','b','a','b','a','b','c','a'};
        char[] p = {'a','b','a','b','a','b','c','a'};
//        char[] s = {'h','e','l','l','o'};
//        char[] p = {'l','l'};
//        int[] kmp = getPMT(p);
//        System.out.println(kmp(s, p, kmp));
        System.out.println(strStr(String.valueOf(s),String.valueOf(p)));
    }
}
