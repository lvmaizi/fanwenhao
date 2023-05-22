package com.example.fanwenhao.offer;

public class _39_ {
    public int majorityElement(int[] nums) {
        int result = nums[0],count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == result) {
                count ++;
            } else {
                if (count == 0) {
                    result = nums[i];
                    count ++;
                } else {
                    count --;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;

        int[] b = new int[10];

        System.arraycopy(a, 0, b, 3, 4);
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
