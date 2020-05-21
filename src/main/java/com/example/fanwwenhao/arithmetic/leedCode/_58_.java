package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 15:31
 * @Version 1.0
 */
public class _58_ {
    public int lengthOfLastWord(String s) {
        int start = 0,end = s.length()-1;
        //尾部去空格
        while (start<=end){
            if(s.charAt(end) == ' ')end--;
        }
        int j=end;
        while (s.charAt(j) !=' ' && j>=0)j--;
        return end-j;
    }

    public static void main(String[] args) {
        int p = new _58_().lengthOfLastWord("h");
        System.out.println();
    }
}
