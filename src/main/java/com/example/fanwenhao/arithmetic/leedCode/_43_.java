package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/29 15:54
 * @Version 1.0
 */
public class _43_ {
    public static void main(String[] args) {
        System.out.println(new _43_().multiply("123", "12"));
    }
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2))return "0";
        String rs = "";
        int x;
        for (int i = num2.length() - 1; i >= 0; i--){
            StringBuilder item = new StringBuilder();
            //补零
            x = num2.length() - 1 - i;
            while (x > 0){
                item.append("0");
                x -- ;
            }
            char c = num2.charAt(i);
            int carry = 0;
            for (int j = num1.length() - 1; j>= 0; j--){
                int res = (c - '0') * (num1.charAt(j) - '0') + carry;
                item.append(res % 10);
                carry = res / 10;
            }
            if(carry != 0)item.append(carry);
            rs = add(rs,item.toString());
        }
        return new StringBuilder(rs).reverse().toString();
    }
    private String add(String s1,String s2){
        StringBuilder rs = new StringBuilder();
        int size = s1.length() > s2.length() ? s1.length():s2.length();
        int carry = 0;
        int c1,c2,res;
        for (int i = 0; i < size; i ++){
            if(i < s1.length()){
                c1 = s1.charAt(i);
            }else c1 = '0';
            if(i < s2.length()){
                c2 = s2.charAt(i);
            }else c2 = '0';
            res = (c1 - '0') + (c2 - '0') + carry;
            rs.append(res % 10);
            carry = res / 10;
        }
        if(carry != 0)rs.append(carry);
        return rs.toString();
    }
}
