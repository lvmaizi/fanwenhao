package com.example.fanwenhao.leetcode;

import com.example.hw._2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_ {

    char[] _2_ = {'a', 'b', 'c'};
    char[] _3_ = {'d', 'e', 'f'};
    char[] _4_ = {'g', 'h', 'i'};
    char[] _5_ = {'j', 'k', 'l'};
    char[] _6_ = {'m', 'n', 'o'};
    char[] _7_ = {'p', 'q', 'r', 's'};
    char[] _8_ = {'t', 'u', 'v'};
    char[] _9_ = {'w', 'x', 'y', 'z'};

    Map<Character, char[]> map = new HashMap<>();

    {
        map.put('2', _2_);
        map.put('3', _3_);
        map.put('4', _4_);
        map.put('5', _5_);
        map.put('6', _6_);
        map.put('7', _7_);
        map.put('8', _8_);
        map.put('9', _9_);
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        letter(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void letter(String digits, int index, StringBuilder curlStr, List<String> result) {
        if (curlStr.length() == digits.length()) {
            result.add(curlStr.toString());
            return;
        }
        char[]  chars = map.get(digits.charAt(index));
        for (char c : chars) {
            letter(digits, index + 1, curlStr.append(c), result);
            curlStr.deleteCharAt(curlStr.length() - 1);
        }
    }

    public static void main(String[] args) {
        _17_ test =  new _17_();
        test.letterCombinations("23").forEach(i -> System.out.println(i));
    }

}
