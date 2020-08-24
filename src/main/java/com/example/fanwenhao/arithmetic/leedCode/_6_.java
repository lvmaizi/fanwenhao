package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/19 17:23
 * @Version 1.0
 */
public class _6_ {
    public String convert(String s, int numRows) {
        if(s == null || s.length()<=0 || numRows <=1)return s;
        StringBuffer result = new StringBuffer();
        StringBuffer[] items = new StringBuffer[numRows];
        for (int i=0;i<items.length;i++)items[i] = new StringBuffer();
        //当前应在第几行追加
        int index = 0;
        //用来存储index是加一还是减一
        boolean flag = true;
        for (char c:s.toCharArray()){
            //判断当前属于第几行
            items[index].append(c);
            if (index == 0)flag=true;
            if (index == numRows-1)flag=false;
            if(flag == true){
                index++;
            }else index--;
        }
        for (StringBuffer item:items)result.append(item);
        return result.toString();
    }

    public static void main(String[] args) {
        new _6_().convert("LEETCODEISHIRING",3);
    }
}
