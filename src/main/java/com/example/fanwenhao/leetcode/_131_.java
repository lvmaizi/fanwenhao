package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _131_ {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currList = new ArrayList<>();
        dfs(s, 0, currList, result);
        return result;
    }

    private void dfs(String s, int start, List<String> currList, List<List<String>> result) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(currList));
            return;
        }
        for (int i = start; i < s.length(); i ++) {
            String sub = s.substring(start, i + 1);
            if (!isHuiWen(sub)) {
                continue;
            }
            currList.add(sub);
            dfs(s, i + 1, currList, result);
            currList.remove(currList.size() - 1);
        }
    }


    private boolean isHuiWen(String s) {
        for (int i = 0; i <= s.length() / 2; i ++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
