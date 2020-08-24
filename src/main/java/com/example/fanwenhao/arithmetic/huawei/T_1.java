package com.example.fanwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/7/14 11:38
 * @Version 1.0
 */
public class T_1 {
    public static void main(String[] args) throws IOException {
        System.out.println(new int[]{1,2,3});
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cstr;
        while((cstr = br.readLine())!=null){
            int count = Integer.parseInt(cstr);
            int order = Integer.parseInt(br.readLine());
            String [] stName = new String[count];
            int [] gr = new int[count];

            for(int i=0;i<count;i++){
                String str = br.readLine();
                String[] strArr = str.split(" ");

                String nameTemp = strArr[0];
                int fsTemp = Integer.parseInt(strArr[1]);

                if(order == 0){
                    int j=0;
                    //高=>低
                    for(j=i-1; j>=0; j--){
                        if(gr[j]<fsTemp){
                            gr[j+1] = gr[j];
                            stName[j+1] = stName[j];
                        }else{
                            break;
                        }
                    }
                    stName[j+1] = nameTemp;
                    gr[j+1] = fsTemp;
                }else{
                    int j=0;
                    //底=>高
                    for(j= i-1; j>=0; j--){
                        if(fsTemp < gr[j] ){
                            gr[j+1]=gr[j];
                            stName[j+1]= stName[j];
                        }else{
                            break;
                        }
                    }
                    stName[j+1] = nameTemp;
                    gr[j+1] = fsTemp;
                }
            }

            for(int k=0; k< count; k++){
                System.out.println(stName[k]+" "+gr[k]);
            }

        }
    }
}
