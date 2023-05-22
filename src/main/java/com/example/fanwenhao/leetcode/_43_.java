package com.example.fanwenhao.leetcode;

public class _43_ {

    public static void main(String[] args) {
        System.out.println('2' * '3');
        _43_ test = new _43_();
        System.out.println(test.multiply("123", "12"));
    }

    public String multiply(String num1, String num2) {
        int result = 0;
        for (int i = num1.length() - 1; i >= 0; i -- ) {
            int c = Character.getNumericValue(num1.charAt(i));
            int itemResult = 0;
            for (int j = num2.length() - 1; j >= 0; j --) {
                int w = (int) Math.pow(10, num2.length() - 1 - j);
                itemResult = itemResult + c * Character.getNumericValue(num2.charAt(j)) * w;
            }
            int w = (int) Math.pow(10, num1.length() - 1 - i);
            result = result + itemResult * w;

        }
        return String.valueOf(result);
    }
}
