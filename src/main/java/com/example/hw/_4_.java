package com.example.hw;

public class _4_ {
    public int getValue(int [] input){
        if(input.length == 0)return 0;
        int c = input[0];
        int count = 1;
        for (int i = 1; i < input.length; i ++){
            if(input[i] == c){
                count ++;
            }else {
                if(count > 0){
                    count --;
                }else {
                    c = input[i];
                    count = 1;
                }
            }
        }
        System.out.println("count" + count);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new _4_().getValue(new int[]{1, 2, 4, 2, 2, 5, 2}));
        System.out.println(new _4_().getValue(new int[]{2,1,1, 2, 4, 2, 2, 5, 2, 1, 2}));

    }
}
