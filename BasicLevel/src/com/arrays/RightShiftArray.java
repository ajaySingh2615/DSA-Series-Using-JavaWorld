package com.arrays;

import java.util.Arrays;

public class RightShiftArray {
    // right shift by one
    public static int[] rightShiftByOne(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] newArray = rightShiftByOne(arr);
        System.out.println(Arrays.toString(newArray));
    }
}
