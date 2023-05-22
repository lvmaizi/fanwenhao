package com.example.fanwenhao.offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _38_ {
    public String[] permutation(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        boolean[] used = new boolean[s.length()];
        dfs(s, used, curr, result);
        return result.toArray(new String[result.size()]);
    }

    private void dfs(String s, boolean[] used, StringBuilder curr, List<String> result) {
        if (curr.length() == used.length) {
            result.add(curr.toString());
            return;
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i ++) {
            if (used[i]) {
                continue;
            }
            if (set.contains(s.charAt(i))) {
                continue;
            }
            set.add(s.charAt(i));
            // 重复
            curr.append(s.charAt(i));
            used[i] = true;
            dfs(s, used, curr,result);
            used[i] = false;
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
