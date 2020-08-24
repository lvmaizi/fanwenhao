package com.example.fanwenhao.common;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Date 2019/11/18 20:03
 * @Version 1.0
 */
public class Test {
    //test git 1
    private String handleJ(String rank){
        if(StringUtils.isBlank(rank)){
            return "";
        }
        if(rank.indexOf("#")==-1){
            return rank;
        }
        if (replaceJ(rank,"[^//*//#/]+")) return rank.replace("#", "/");
        if (replaceJ(rank,"[^//#]+")) return rank.replace("#", "/");

        String numbers=getRankNumber(rank);
        char[] numbersChars=numbers.toCharArray();
        char[] rankChars= rank.toCharArray();
        char[] rankReplace= new char[rankChars.length];
        int idx=0;
        for (int i=0;i<rankChars.length;i++){
            rankReplace[i]=rankChars[i];
            if("#".equals(String.valueOf(rankChars[i]))){
                if(idx>numbersChars.length-1){
                    rankReplace[i]='N';
                }else{
                    rankReplace[i]=numbersChars[idx];
                }
                idx++;
            }
        }
        return String.valueOf(rankReplace);
    }
    private boolean replaceJ(String rank,String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(rank);
        while(!m.find()){
            return true;
        }
        return false;
    }
    private String getRankNumber(String rank) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(rank);
        StringBuffer sb=new StringBuffer();
        while(m.find()){
            sb.append(m.group().trim());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Map map = new HashMap<>();
        System.out.println(String.format(null));

        System.out.println("EC:D0:9F:E9:A4:89".toLowerCase());

        System.out.println("200".compareTo("100"));

        Test test = new Test();
        String i = test.handleJ("#*****#**4**************N");
        System.out.println(1>0);
    }
}
