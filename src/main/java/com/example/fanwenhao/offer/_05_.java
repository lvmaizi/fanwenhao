package com.example.fanwenhao.offer;

public class _05_ {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') {
                stringBuilder.append("%20");
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
