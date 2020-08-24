package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/21 11:22
 * @Version 1.0
 */
public class _9_ {
    public static void main(String[] args) {
        new _9_().isPalindrome1(1);
    }
    //字符串
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        String s = String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
    //反转一半数字
    public boolean isPalindrome1(int x) {
        x = 10;
        if (x<0)return false;
        //反转后的尾部数字
        int tai = 0;
        while (tai < x){
            tai = tai*10+x%10;
            x=x/10;
        }
        return x==tai || x == tai/10;
    }
}
