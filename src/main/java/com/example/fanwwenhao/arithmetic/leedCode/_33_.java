package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/28 17:05
 * @Version 1.0
 */
public class _33_ {
    public static void main(String[] args) {
        System.out.println(new _33_().search(new int[]{4,5,6,7,0,1,2},0));
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0)return -1;
        int start = nums[0];
        int i = 0,j = nums.length-1;
        while (i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] == target)return mid;
            if(target < start){
                if(nums[mid] >= start)i = mid+1;
                else {
                    if(nums[mid] < target)i = mid+1;
                    else j = mid-1;
                }
            }else {
                if(nums[mid] < start)j = mid-1;
                else {
                    if(nums[mid] < target)i = mid + 1;
                    else j = mid - 1;
                }
            }
        }
        return -1;
    }
}
