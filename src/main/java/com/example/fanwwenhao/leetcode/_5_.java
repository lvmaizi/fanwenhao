package com.example.fanwwenhao.leetcode;

public class _5_ {
    /**
     * 第一种方法最长公共子串
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        int[][] array = new int[s.length()+1][s.length()+1];
        //记录最长子串坐标
        int i=0,j=0,max=0;
        for (int a=1;a<=s.length();a++){
            for (int b=1;b<=s1.length();b++){
                if(s.charAt(a-1)==s1.charAt(b-1)){
                    array[a][b]=array[a-1][b-1]+1;
                }else {
                    array[a][b]=0;
                }
                if(max<array[a][b]){
                    max=array[a][b];
                    j=a;
                }
            }
        }
        //遍历数组
        for (int[] arrayItem:array){
            for (int a:arrayItem){
                System.out.print(a+" ");
            }
            System.out.println("");
        }

        return null;
    }

    /**
     * 动态规划
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        boolean result[][] = new boolean[s.length()][s.length()];
        for (int i=2;i<s.length();i++){
            for (int j=0;j+i<s.length();j++){
                if(s.charAt(j)==s.charAt(j+i)){
                    result[j][j+i]=result[j+1][j+i-1]==true?true:false;
                }else {
                    result[j][j+i]=false;
                }
            }
        }
        for (boolean[] arrayItem:result){
            for (boolean a:arrayItem){
                System.out.print(a);
            }
            System.out.println("");
        }
        return null;
    }


    public static void main(String[] args) {
        new _5_().longestPalindrome1("abbbc");
    }
}
