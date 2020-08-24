package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/19 18:26
 * @Version 1.0
 */
public class _11_ {
    public int maxArea(int[] height) {
        if(height.length<2)return 0;
        //定义状态
        int areas[] = new int[height.length];
        for (int i=height.length-2;i>=0;i--){
            //若以当前坐标为起始点 遍历求的所有容器
            for (int j=i+1;j<height.length;j++){
                int area = (j-i)*Math.min(height[j],height[i]);
                areas[i] = Math.max(areas[i],Math.max(areas[j],area));
            }
        }
        return areas[0];
    }
    //双指针解法
    public int maxAreaA(int[] height) {
        if(height.length<2)return 0;
        int result = 0;
        int i=0,j=height.length-1;
        while (i<j){
            result = Math.max(result,(j-i)*Math.min(height[j],height[i]));
            if(height[j] < height[i])j--;
            else i++;
        }
        return result;
    }

    public static void main(String[] args) {
        new _11_().maxAreaA(new int[]{2,3,4,5,18,17,6});
    }
}
