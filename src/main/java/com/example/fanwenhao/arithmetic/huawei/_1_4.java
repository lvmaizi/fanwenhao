package com.example.fanwenhao.arithmetic.huawei;

/**
 * 字符串加密
 */
public class _1_4 {
    public static void main(String[] args) {
        String str = "xy";
        StringBuffer rs = new StringBuffer();
        int a0=1,a1=2,a2=4;
        if(str.length()>0)rs.append(encryptChar(str.charAt(0),a0));
        if(str.length()>1)rs.append(encryptChar(str.charAt(1),a1));
        if(str.length()>2)rs.append(encryptChar(str.charAt(2),a2));

        for (int i=3;i<str.length();i++){
            rs.append(encryptChar(str.charAt(i),a0+a1+a2));
            int tmp = a2;
            a2 = a0+a1+a2;
            a0 = a1;
            a1 = tmp;
        }
        System.out.println(rs);
    }
    private static char encryptChar(char c,int offset){
        char rs = (char) (((c-'a')+offset)%26+'a');
        return rs;
    }
}
