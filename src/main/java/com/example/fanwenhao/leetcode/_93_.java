package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _93_ {
    public static void main(String[] args) {
        _93_ test = new _93_();
        test.restoreIpAddresses("101023").forEach(s -> System.out.println(s));
    }

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return new ArrayList<>();
        }
        return restoreIpAddresses(s, 0, 4);
    }

    private List<String> restoreIpAddresses(String s, int start, int count) {
        List<String> result = new ArrayList<>();
        // 其他入参校验
        if (count == 1) {
            String subString = s.substring(start);
            if (isRight(subString)) {
                result.add(subString);
            }
            return result;
        }
        for (int i = start + 1; i < s.length(); i ++) {
            String subString = s.substring(start, i);
            if (isRight(subString)) {
                List<String> stringList = restoreIpAddresses(s, i, -- count);
                for (String sItem : stringList) {
                    result.add(subString + "." + sItem);
                }
                ++ count;
            }
        }
        return result;
    }

    private boolean isRight(String s) {
        if (s.length() < 4 && Integer.valueOf(s) <= 255 && !(s.startsWith("0") && s.length() > 1)) {
            return true;
        }
        return false;
    }
}
