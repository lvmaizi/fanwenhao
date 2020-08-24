package com.example.fanwenhao.arithmetic.offer;

public class _11_ {
    public int minArray(int[] numbers) {
        if(numbers.length == 0)return 0;
        int start = 0,end = numbers.length-1,mid;
        //若未选转
        if(numbers[start]<numbers[end])return numbers[0];
        while (true){
            mid = (start+end)/2;
            if(numbers[mid] == numbers[start] && numbers[mid] == numbers[end]){
                return findByOrder(numbers,start,end);
            }
            if(numbers[mid]>=numbers[start]){
                start = mid;
            }
            if(numbers[mid]<=numbers[end]){
                end = mid;
            }
            if(start +1 == end)break;
        }
        return numbers[end];
    }
    public int findByOrder(int[] numbers,int start,int end){
        int result=numbers[start];
        for (int i = start;i<=end;i++){
            result = Math.min(result,numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new _11_().minArray(new int[]{2,2,2,0,1}));
    }
}
