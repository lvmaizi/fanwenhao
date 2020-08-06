package com.example.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = bf.readLine()) != null){
            if (isValid(input)){
                List<String> list = getArray(input);
                StringBuffer result = new StringBuffer();
                for (int i = 0;i < list.size(); i++){
                    if(list.get(i).length() == 1 && list.get(i).charAt(0) >= 'a' && list.get(i).charAt(0) <= 'z'){
                        result.append(list.get(i));
                    }else {
                        if(i == list.size()-1 && Integer.parseInt(list.get(i)) <=2){
                            result = new StringBuffer("!error");
                            break;
                        }else {
                            for (int j = 1;j < Integer.parseInt(list.get(i)); j++){
                                result.append(String.valueOf(list.get(i+1)));
                            }
                        }
                    }
                }
                System.out.println(result);
            }else {
                System.out.println("!error");
            }
        }
    }
    private static boolean isValid(String input){
        if("".equals(input))return false;
        for (int i = 0;i < input.length();i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')continue;
            if(input.charAt(i) >= '0' && input.charAt(i) <= '9')continue;
            return false;
        }
        return true;
    }
    private static List getArray(String input){
        List result = new ArrayList();
        int start = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                result.add(String.valueOf(input.charAt(i)));
                start = i + 1;
            }else {
                if(i != input.length()-1 && (input.charAt(i+1) >= 'a' && input.charAt(i+1) <= 'z')){
                    result.add(String.valueOf(input.substring(start,i+1)));
                    start = i;
                }
            }
        }
        return result;
    }

}
