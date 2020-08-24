package com.example.fanwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/24 9:26
 * @Version 1.0
 */
public class _4_1 {
    public static void main(String[] args) {
        int[][] input = new int[][]{
                {1,2},
                {1,1}
        };
        //特殊 当n<=2
        if(input.length==1)return;
        if(input.length==2){
            handle2Length(input);
            return;
        }

        int x = 0,y = 0;
        int[] tmpX = new int[input.length];
        for (int i = 0;i < input.length; i++){
            int sum = 0;
            for (int j = 0;j < input[0].length; j++){
                sum = sum + input[i][j];
            }
            tmpX[i] = sum;
        }
        x = getDifferent(tmpX);
        int[] tmpY = new int[input[0].length];
        for (int j = 0;j < input[0].length;j ++){
            int sum = 0;
            for (int i = 0;i<input.length;i ++){
                sum = sum + input[i][j];
            }
            tmpY[j] = sum;
        }
        y = getDifferent(tmpY);
        //找到差值
        int sum1 = 0,sum2 = 0;
        for (int j = 0;j < input[0].length;j++){
            sum1 = sum1 + input[x][j];
        }
        for (int i = 0;i < input.length;i++){
            if(i == x)continue;
            for (int j = 0;j < input[0].length;j++){
                sum2 = sum2 + input[i][j];
            }
            break;
        }
        int changeValue = input[x][y] + (sum2 - sum1);
        System.out.println("x:"+(x+1));
        System.out.println("y:"+(y+1));
        System.out.println("changeValue:"+changeValue);
    }
    //查找数组中两个不同的元素，并返回元素数量较少的那个位置
    //数组长度需大于2
    private static int getDifferent(int[] target){
        int result = 0;
        int count = 0;
        for (int i=0;i<target.length;i++){
            if(target[i] == target[0]){
                count ++;
            }else {
                if(count>1)return i;
                else return target[i+1] == target[0]?i:result;
            }
        }
        return result;
    }
    //长度为2的特殊处理
    public static void handle2Length(int[][] input){
        int x = 0;
        int y = 0;
        int count = 0;
        c:for (int i = 0;i < input.length; i++){
            for (int j = 0;j < input[0].length; j++){
                if (input[i][j] == input[0][0])count++;
                else {
                    if(count>1){
                        x = i;
                        y = j;
                        break c;
                    }else {
                        if(input[i+1][0] != input[i][j]){
                            x = i;
                            y = j;
                            break c;
                        }else break c;
                    }
                }
            }
        }
        int changeValue = x==0?input[1][0]:input[0][0];
        System.out.println("x:"+(x+1));
        System.out.println("y:"+(y+1));
        System.out.println("changeValue:"+changeValue);
    }

}
