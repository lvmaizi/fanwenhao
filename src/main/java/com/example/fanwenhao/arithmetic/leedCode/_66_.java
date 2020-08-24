package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/23 15:33
 * @Version 1.0
 */
public class _66_ {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        for (int i = digits.length-1;i>=0;i++){
            if(digits[i]<9){
                digits[i]++;
                break;
            }else {
                digits[i] = 0;
            }
            if(i == 0)flag = true;
        }
        if(flag){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
}
