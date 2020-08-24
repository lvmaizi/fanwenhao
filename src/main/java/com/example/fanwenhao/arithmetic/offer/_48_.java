package com.example.fanwenhao.arithmetic.offer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Date 2020/6/24 9:59
 * @Version 1.0
 */
public class _48_ {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        //求以某个字符尾结尾的最大字符串长度
        for (int i=0;i<s.length();i++){
            HashSet set = new HashSet();
            for (int j=i;j>=0;j--){
                if (!set.contains(s.charAt(j)))set.add(s.charAt(j));
                else break;
            }
            result = Math.max(result,set.size());
        }
        return result;
    }

    public int lengthOfLongestSubstring1(String s) {
        int result = 0;
        //求以某个字符尾结尾的最大字符串长度,有一个滑动窗口
        int start=0,end=-1;
        for (int i=0;i<s.length();i++){
            for (int j=end;j>=start;j--){
                if(s.charAt(i)==s.charAt(j)){
                    start = j+1;
                    break;
                }
            }
            end = i;
            result = Math.max(result,end-start+1);
        }
        return result;
    }
    public int lengthOfLongestSubstring2(String s) {
        int result = 0;
        //求以某个字符尾结尾的最大字符串长度,有一个滑动窗口
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int start =0;
        for (int i=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                start = Math.max(start,hashMap.get(s.charAt(i))+1);
            }
            hashMap.put(s.charAt(i),i);
            result = Math.max(result,i-start+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new _48_().lengthOfLongestSubstring2("abba"));
    }
}
