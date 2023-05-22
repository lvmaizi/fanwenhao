package com.example.fanwenhao.leetcode;

import java.util.*;

public class _15_ {

    // 看了思路
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        if (nums.length == 0) {
            return threeSumList;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> twoSumList = twoSum(nums, -nums[i], i + 1, nums.length - 1);
            for (List<Integer> twoSum : twoSumList) {
                List<Integer> threeSum = new ArrayList();
                threeSum.add(nums[i]);
                threeSum.addAll(twoSum);
                threeSumList.add(threeSum);
            }
        }
        return threeSumList;
    }

    private List<List<Integer>> twoSum(int[] nums, int sum, int start, int end) {
        List<List<Integer>> twoSumList = new ArrayList<>();
        if (start >= end) {
            return twoSumList;
        }
        while (start < end) {
            if (nums[start] > sum || nums[end] < sum) {
                break;
            }
            int sumA = nums[start] + nums[end];
            if (sumA < sum) {
                start ++;
            } else if (sumA > sum) {
                end --;
            } else {
                twoSumList.add(Arrays.asList(start, end));
                while (start < end && nums[start] == nums[start+1]) {
                    start++;
                }
                while (start < end && nums[end] == nums[end - 1]) {
                    end --;
                }

                start ++;
                end --;

            }
        }
        return twoSumList;
    }


    // 自己写的
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        if (nums.length == 0) {
            return threeSumList;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> twoSumList = twoSum2(nums, -nums[i], i + 1, nums.length - 1);
            for (List<Integer> twoSum : twoSumList) {
                List<Integer> threeSum = new ArrayList();
                threeSum.add(nums[i]);
                threeSum.addAll(twoSum);
                threeSumList.add(threeSum);
            }
        }
        return threeSumList;
    }

    private List<List<Integer>> twoSum2(int[] nums, int sum, int start, int end) {
        List<List<Integer>> twoSumList = new ArrayList<>();
        if (start >= end) {
            return twoSumList;
        }
        Map<Integer, Integer> map = new HashMap();
        for (int i = start; i <= end; i++) {
            map.put(nums[i], i);
        }
        for (int i = start; i <= end; i++) {
            if (i != start && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = sum - nums[i];
            Integer index = map.get(target);
            if (index != null && index > i) {
                List<Integer> twoSum = new ArrayList<>();
                twoSum.add(nums[i]);
                twoSum.add(target);
                twoSumList.add(twoSum);
            }
        }
        return twoSumList;
    }
}
