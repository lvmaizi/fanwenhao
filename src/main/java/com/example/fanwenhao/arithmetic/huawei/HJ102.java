package com.example.fanwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Date 2020/7/17 10:26
 * @Version 1.0
 */
public class HJ102 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine())!=null){
            Map<Character,Integer> map = new HashMap<>();
            for (int i=0;i<str.length();i++){
                if((str.charAt(i)>= 'A' && str.charAt(i)<= 'Z') || (str.charAt(i)>= 'a' && str.charAt(i)<= 'z')
                        || (str.charAt(i)>='0' && str.charAt(i)<='9') || str.charAt(i) == ' '){
                    if (map.get(str.charAt(i))==null){
                        map.put(str.charAt(i),1);
                    }else {
                        map.put(str.charAt(i),map.get(str.charAt(i))+1);
                    }
                }
            }
            List<Map.Entry> list = new LinkedList();
            for (Map.Entry e:map.entrySet()){
                list.add(e);
            }
            Collections.sort(list, new Comparator<Map.Entry>() {
                @Override
                public int compare(Map.Entry o1, Map.Entry o2) {
                    if((Integer)o1.getValue() - (Integer)o2.getValue()==0){
                        return (Character)o1.getKey()-(Character)o2.getKey();
                    }
                    return (Integer)o2.getValue() - (Integer)o1.getValue();
                }
            });
            StringBuffer result = new StringBuffer();
            for (Map.Entry e:list){
                result.append(e.getKey());
            }
            System.out.println(result.toString());
        }
    }
}
