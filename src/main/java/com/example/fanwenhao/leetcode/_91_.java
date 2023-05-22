package com.example.fanwenhao.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _91_ {
    private Map<String, Character> map = new HashMap();
    {
        map.put("1", 'A');
        map.put("2", 'B');
        map.put("3", 'C');
        map.put("4", 'D');
        map.put("5", 'F');
        map.put("6", 'G');
        map.put("7", 'H');
        map.put("8", 'I');
        map.put("9", 'J');
        map.put("10", 'K');
        map.put("11", 'l');
        map.put("12", 'M');
        map.put("13", 'N');
        map.put("14", 'O');
        map.put("15", 'P');
        map.put("16", 'Q');
        map.put("17", 'R');
        map.put("18", 'S');
        map.put("19", 'T');
        map.put("20", 'U');
        map.put("21", 'V');
        map.put("22", 'W');
        map.put("23", 'X');
        map.put("24", 'Y');
        map.put("25", 'Z');
        map.put("26", 'E');
    }

    int result = 0;
    public int numDecodings(String s) {
//        dfs(s, 0, s.length() - 1);
        int[] nums = new int[s.length()];
        for (int i = s.length() -1; i >=0 ;i--) {
            if (i + 1 == s.length()) {
                if (map.get(s.substring(i, i + 1)) != null) {
                    nums[i] = 1;
                }
                continue;
            }
            if (i + 2 == s.length()) {
                if (map.get(s.substring(i, i + 1)) != null) {
                    nums[i] += nums[i + 1];
                }
                if (map.get(s.substring(i, i + 2)) != null) {
                    nums[i] += nums[i] + 1;
                }
                continue;
            }
            if (map.get(s.substring(i, i + 1)) != null) {
                nums[i] += nums[i + 1];
            }
            if (map.get(s.substring(i, i + 2)) != null) {
                nums[i] += nums[i + 2];
            }
        }
        return result;
    }

    private void dfs(String s, int start, int end) {
        if (start > end) {
            result ++ ;
            System.out.println("=====");
            return;
        }
        if (start  <= end) {
            if (map.get(s.substring(start, start + 1)) != null) {
                System.out.println("=====1");
                dfs(s, start + 1, end);
            }
        }
        if (start + 1 <= end) {
            if (map.get(s.substring(start, start + 2)) != null) {
                System.out.println("=====2");
                dfs(s, start + 2, end);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("12".substring(0, 1));
        System.out.println("12".substring(0, 0));

    }
}
