package com.example.fanwenhao.arithmetic.leedCode;

public class _5_ {
    /**
     * 中心扩展法
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String result = "";
        //奇数
        for (int i=0;i<s.length();i++){
            int j = 0;
            while ((i-j)>=0 && (i+j)<s.length()){
                if(s.charAt(i-j) != s.charAt(i+j))break;
                result = result.length()<(2*j+1)?s.substring(i-j,i+j+1):result;
                j++;
            };
        }
        //偶数
        for (int i =0;i<s.length()-1;i++){
            int j = 0;
            while (i-j+1>=0 && (i+j+1)<s.length()){
                if(s.charAt(i-j) != s.charAt(i+j+1))break;
                result = result.length()<(2*j+2)?s.substring(i-j,i+j+2):result;
                j++;
            }
        }
        return result;
    }

    /**
     * 马拉车
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        String result = "";
        StringBuffer str = new StringBuffer();
        for (char c:s.toCharArray()){
            str.append(c+"#");
        }

        str.deleteCharAt(str.length()-1);
        return result;
    }


    /**
     * 动态规划
     * 回文天然具有子问题结构
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        if(s.length()==0)return "";
        String result = "";
        //回文字符串定义
        int[][] max = new int[s.length()][s.length()];
        //初始状态
        for (int i=0;i<s.length();i++){
            max[i][i] = 1;
        }
        int start=0,end=0,maxLength=1;

        for (int i=2;i<=s.length();i++){
            for (int j=0;j<=s.length()-i;j++){
                if(s.charAt(j) == s.charAt(j+i-1)){
                    //字串是回文串
                    if(max[j+1][j+i-2]>0 || i==2){
                        max[j][j+i-1] = 1;
                        if (i>maxLength){
                            start = j;
                            end = j+i-1;
                            maxLength = i;
                        }
                    }
                }
            }
        }
        result  = s.substring(start,end+1);
        return result;
    }

    public static void main(String[] args) {
        new _5_().longestPalindrome2("babad");
    }
}
