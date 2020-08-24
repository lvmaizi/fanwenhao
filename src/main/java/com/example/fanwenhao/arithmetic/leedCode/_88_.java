package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 15:03
 * @Version 1.0
 */
public class _88_ {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n;
        for (int i=length-1;i>=0;i--){
            if(n==0){
                nums1[i] = nums1[m-1];
                m--;
                continue;
            }
            if(m==0){
                nums1[i] = nums2[n-1];
                n--;
                continue;
            }
            if(nums1[m-1]>nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            }else {
                nums1[i] = nums2[n-1];
                n--;
            }
        }
    }
}
