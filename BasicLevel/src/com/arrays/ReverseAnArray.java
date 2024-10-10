package com.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseAnArrayAlgo(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50};

        reverseAnArrayAlgo(elements);
        System.out.println(Arrays.toString(elements));
    }
}
