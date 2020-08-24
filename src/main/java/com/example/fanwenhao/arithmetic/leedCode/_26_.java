package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 10:48
 * @Version 1.0
 */
public class _26_ {
    public int removeDuplicates(int[] nums) {
        //定义压缩指针指向当前压缩后的坐标
        int cur = 0;
        for (int i=0;i<nums.length;i++){
            //向前查找是否有重复的
            boolean flag = false;
            for(int j=i-1;j>=0;j--){
                if(nums[j] == nums[i])flag = true;
                //假设从小到大
                if(nums[i]>nums[j])break;
            }
            if(flag == false){
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;
    }

    //双指针法 leetCode
    public int removeDuplicatesA(int[] nums) {
        int j=0;
        for (int i = 1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
    public static void main(String[] args) {
        new _26_().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
}
