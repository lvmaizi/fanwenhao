package com.example.fanwenhao.offer;

public class _46_ {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        //
        int[] nums = new int[s.length()];
        nums[ s.length() - 1] = 1;
        nums[ s.length() - 2] = (s.charAt(s.length() - 2) == '1' || s.charAt(s.length() - 2) == '2')
                && (s.charAt(s.length() - 1) >= '0' || s.charAt(s.length() - 1) <= '5') ? 2 : 1;
        for (int i = s.length() - 3; i >= 0; i--) {
            int fi_plus1 = nums[i + 1];
            nums[i] = fi_plus1 + 1;
            if ((s.charAt(i) == '1' || s.charAt(i) == '2')
                    && (s.charAt(i + 1) >= '0' || s.charAt(i + 1) <= '5')) {
                int fi_plus2 = i == s.length() - 2 ? 0 : nums[i + 2];
                nums[i] += fi_plus2 + 1;
            }
        }
        return nums[0];
    }
}
