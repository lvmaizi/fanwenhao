package com.example.fanwwenhao.arithmetic.leedCode;

public class _80_ {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2)return nums.length;
        int end = 2;
        for (int i = 2; i < nums.length; i++){
            if(nums[i] != nums[end - 2]) {
                nums[end++] = nums[i];
            }
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(new _80_().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}
