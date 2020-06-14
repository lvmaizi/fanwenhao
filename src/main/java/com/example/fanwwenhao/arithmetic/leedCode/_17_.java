package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class _17_ {
    /**
     * 取第一位 + 递归后面的元素
     * @param digits
     * @return
     */
    List results = new ArrayList();
    String[] letters = new String[]{
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return results;
        subLetterCombinations(digits,0,"");
        return results;
    }
    void subLetterCombinations(String digits,int index, String preStr){
        if(preStr.length()==digits.length()){
            results.add(preStr);
            return;
        }
        //递归逻辑 （需）
        String letterItem = letters[Integer.valueOf(digits.substring(index,index+1))-2];
        for (int i=0;i<letterItem.length();i++){
            subLetterCombinations(digits,index+1,preStr + letterItem.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "123";
        System.out.println(s.substring(1,2));
        System.out.println(Integer.valueOf('2'));
        List results = new _17_().letterCombinations("23");
        System.out.println("s");
    }
}
