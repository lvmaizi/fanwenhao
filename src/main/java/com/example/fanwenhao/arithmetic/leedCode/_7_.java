package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/21 10:38
 * @Version 1.0
 */
public class _7_ {
    public static void main(String[] args) {
        int x = -1234;
        int rev=0;
        System.out.println(Integer.MAX_VALUE*10);
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) break;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) ;
            rev = rev * 10 + pop;
        }
        System.out.println(rev);

    }
}
