package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _22_ {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <=0 ) {
            return result;
        }
        generateParenthesis("", n, n, result);
        return result;
    }

    public void generateParenthesis(String currStr, int left_size, int right_size, List<String> result) {
        if (left_size == 0 && right_size == 0) {
            result.add(currStr);
            return;
        }
        if (left_size > 0) {
            generateParenthesis(currStr + "(", left_size - 1, right_size, result);
        }
        if (right_size > 0 && right_size > left_size) {
            generateParenthesis(currStr + ")" , left_size, right_size - 1, result);
        }
    }

    public static void main(String[] args) {
        _22_ test = new _22_();
        test.generateParenthesis(3).forEach(i-> System.out.println(i));
    }
}
