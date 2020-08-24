package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/22 10:04
 * @Version 1.0
 */
public class _4_9 {
    public static void main(String[] args) {
        String str = "asdfas";
        String p = "sd[]";
        for (int i = 0;i<str.length();i++){
            if(match(str.substring(i,str.length()),p)){
                System.out.println(i+1);
            }
        }
    }
    private static boolean match(String s,String p){
        int i = 0,j = 0,start = 0;
        while (j<p.length()){
            String match = String.valueOf(p.charAt(j));
            if(p.charAt(j) == '['){
                //找到下一个]
                for (int a = j;a<p.length();a++){
                    if(p.charAt(a) == ']'){
                        match = p.substring(j,a+1);
                        j = a;
                        break;
                    }
                }
            }
            if (i>=s.length())return false;
            if(match.contains(String.valueOf(s.charAt(i)))){
                j++;
                i++;
            }else return false;
        }
        return true;
    }
}
