package com.example.fanwenhao.offer;

public class _11_ {
    public int minArray(int[] numbers) {
        int head = numbers[0];
        int tail = numbers[numbers.length - 1];
        return minArray(numbers, 0, numbers.length - 1);
    }

    private int minArray(int[] numbers, int left, int right) {
        if (left == right) {
            return numbers[left];
        }
        int tail = numbers[right];
        int mid = (left + right) / 2;
        if (numbers[mid] > tail) {
            return minArray(numbers, mid + 1, right);
        } else if (numbers[mid] < tail) {
            return minArray(numbers, left, mid);
        } else {
            return minArray(numbers, left, right - 1);
        }
    }
}
