package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/30 16:38
 * @Version 1.0
 */
public class _125_ {
    public boolean isPalindrome(String s) {
        int i = 0,j = s.length()-1;
        while (i < j){
            while (i < j){
                if(isValid(s.charAt(i))){
                    break;
                }else i++;
            }
            while (i < j){
                if(isValid(s.charAt(j))){
                    break;
                }else j--;
            }
            if(isEqual(s.charAt(i),s.charAt(j))){
                i++;
                j--;
            }else return false;
        }
        return true;
    }
    //是否是有效字符
    public boolean isValid(char c){
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')  ;
    }
    //字符是否相等
    public boolean isEqual(char a,char b){
        if((('a' <= a && a <= 'z') || ('A' <= a && a <= 'Z')) && (('a' <= b && b <= 'z') || ('A' <= b && b <= 'Z'))){
            return Character.toLowerCase(a) == Character.toLowerCase(b);
        }
        return a == b;
    }
}
