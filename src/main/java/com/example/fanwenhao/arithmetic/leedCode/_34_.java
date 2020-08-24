package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/28 17:43
 * @Version 1.0
 */
public class _34_ {
    public static void main(String[] args) {
        System.out.println(new _34_().searchRange(new int[]{1,2,3,3,4,4,4,5,6},4)[0]);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] rs = new int[2];
        rs[0] = -1;
        rs[1] = -1;
        int i = 0,j = nums.length-1;
        while (i <= j){
            int mid = (i + j)/2;
            if(nums[mid] == target){
                //顺序找
                int s = mid,e = mid;
                while (s-1 >= 0 && nums[s-1] == target)s--;
                while (e+1 < nums.length && nums[e+1] == target)e++;
                rs[0] = s;
                rs[1] = e;
                return rs;
            }else if(nums[mid] > target)j = mid - 1;
            else i = mid + 1;
        }
        return rs;
    }
}
