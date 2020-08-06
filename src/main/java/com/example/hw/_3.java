package com.example.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = bf.readLine()) != null){
            int userNum = Integer.parseInt(input.split(" ")[0]);
            int messageNum = Integer.parseInt(input.split(" ")[1]);
            if(userNum <1 || (messageNum >100000 || messageNum <0)){
                System.out.println("NULL");
                continue;
            }
            String[] inputs = new String[messageNum];
            for (int i = 0; i <messageNum;i++){
                inputs[i] = bf.readLine();
            }
            List teams = getTeams(inputs);
            for (int i = 0;i< inputs.length; i++){
                String[] s1 = inputs[i].split(" ");
                if(Integer.parseInt(s1[0]) < 1 || Integer.parseInt(s1[0]) >userNum
                        || Integer.parseInt(s1[1]) < 1 || Integer.parseInt(s1[1]) >userNum ){
                    System.out.println("da pian zi");
                    continue;
                }
                if("0".equals(s1[2]))continue;
                if("1".equals(s1[2])){
                    if (isTeam(teams,s1))
                        System.out.println("we are a team");
                    else
                        System.out.println("we are not a team");
                }else {
                    System.out.println("da pian zi");
                }
            }

        }
    }
    private static List getTeams(String[] input){
        List<Set> rs = new ArrayList();
        for (int i = 0;i<input.length; i++){
            String[] s = input[i].split(" ");
            c:if("0".equals(s[2])){
                if(rs.size()>0){
                    for (int j = 0; j< rs.size(); j++){
                        if(rs.get(j).contains(s[0]) || rs.get(j).contains(s[1])){
                            rs.get(j).add(s[0]);
                            rs.get(j).add(s[1]);
                            break c;
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                hashSet.add(s[0]);
                hashSet.add(s[1]);
                rs.add(hashSet);
            }
        }
        return rs;
    }
    private static boolean isTeam(List<Set> teams,String[] message){
        for (int i = 0;i < teams.size(); i++){
            if(teams.get(i).contains(message[0]) && teams.get(i).contains(message[1]))
                return true;
        }
        return false;
    }
}
