package com.example.fanwwenhao.arithmetic;

class Solution {
    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2, 3));
        char x = '2';
        switch (x){
            case 'a':
                System.out.println("a");
        }
        int i = 0;
        switch (i){
            case 1:
                System.out.println("1");
        }
        String s = "s";
        switch (s){
            case "s":
                System.out.println("s");
        }
    }
}
