package com.example.hw;

public class T {
    //最长公共前缀
    private String subPreString(String[] strings){
        if(strings.length == 0)return "";
        StringBuffer sf = new StringBuffer();
        int index = 0;
        w:while (true){
            char c = ' ';
            if(strings[0].length() > index){
                c = strings[0].charAt(index);
            }else {
                break w;
            }
            for (int i = 0;i <strings.length; i++){
                if(strings[i].length() > index){
                    if(strings[i].charAt(index) != c)
                        break w;
                }else {
                    break w;
                }
            }
            sf.append(c);
            index ++;
        }
        return sf.toString();
    }

    public static void main(String[] args) {
        System.out.println(new T().subPreString(new String[]{
                "dabc",
                "ab",
                "ab"
        }));
        System.out.println(new T().subString(new String[]{
                "eabct",
                "rabct",
                "cabcp"
        }));
    }
    //最长公共子串
    private String subString(String[] strings){
        if(strings.length == 0)return "";
        if(strings.length == 1)return strings[0];
        String s = subTwoString(strings[0],strings[1]);
        for (int i= 2; i < strings.length; i++){
            s = subTwoString(s,strings[i]);
        }
        return s;
    }
    public String subTwoString(String s1,String s2){
        String rs = "";
        for (int i = 0; i < s1.length(); i++){
            for (int j = 0; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    String s = subPreTwoString(s1.substring(i,s1.length()),s2.substring(j,s2.length()));
                    rs = rs.length() < s.length()?s:rs;
                }
            }
        }
        return rs;
    }
    public String subPreTwoString(String s1,String s2){
        StringBuffer sf = new StringBuffer();
        for (int i = 0;i < s1.length(); i++){
            if(s2.length() > i){
                if(s1.charAt(i) == s2.charAt(i)){
                    sf.append(s1.charAt(i));
                }else break;
            }else break;
        }
        return sf.toString();
    }
}
