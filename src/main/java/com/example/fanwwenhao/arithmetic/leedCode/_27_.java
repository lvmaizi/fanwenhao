package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 9:06
 * @Version 1.0
 */
public class _27_ {
    //自己想法
    public int removeElement(int[] nums, int val) {
        int range = nums.length-1;
        for (int i=0;i<nums.length&&i<=range;i++){
            if(nums[i] == val){
                //与最后一个元素交换
                int tmp = nums[range];
                nums[range] = nums[i];
                nums[i] = tmp;
                i--;
                range--;
            }
        }
        return range+1;
    }
    //leetCode 双指针法
    public int removeElementA(int[] nums, int val) {
        int j =0;
        for (int i=0;i<nums.length;i++){
            if(val != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {
        new _27_().removeElement(new int[]{0,1,2,2,3,0,4,2},2);
    }
}
