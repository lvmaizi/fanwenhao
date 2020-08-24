package com.example.fanwenhao.arithmetic.leedCode;

public class _75_ {
    //两次变量
    public void sortColors(int[] nums) {
        int a = 0,b = 0,c = 0;
        for (int i = 0; i < nums.length; i++){
            switch (nums[i]){
                case 0: a++;break;
                case 1: b++;break;
                case 2: c++;break;
            }
        }
        for (int i = 0; i < nums.length; i ++){
            if(i < a){
                nums[i] = 0;
                continue;
            }
            if(i < a+b){
                nums[i] = 1;
                continue;
            }
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        int[] v = new int[]{2,0,2,1,1,0};
        for (int i = 0;i < v.length; i++){
            switch (v[i]){
                case 0:a++;break;
                case 1:b++;break;
                case 2:c++;break;
            }
        }
        System.out.println(a+""+b+""+c);
        //new _75_().sortColors(new int[]{2,0,2,1,1,0});
    }
    //一次变量
    public void sortColors1(int[] nums) {
        int i = 0,j = nums.length-1;
        int a = 0,b = nums.length-1;
        while (i < j){
            while (i < j && nums[i] == 0){
                i++;
            }
            a = i;
            while (i < j && nums[j] == 2){
                j--;
            }
            b = j;
            if(nums[i] == 2){
                int tmp = nums[i];
                nums[i] = nums[b];
                nums[b] = tmp;
            }
            if(nums[j] == 0){
                int tmp = nums[j];
                nums[j] = nums[a];
                nums[a] = tmp;
            }
        }
    }
}
