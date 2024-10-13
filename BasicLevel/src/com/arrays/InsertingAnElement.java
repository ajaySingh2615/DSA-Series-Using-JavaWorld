package com.arrays;

import java.util.Arrays;

public class InsertingAnElement {
    // inserting an element in an array
    public static int[] insertingAnArray(int[] arr, int x, int p) {
        int n = arr.length;
        int[] output = new int[n + 1];
        int index = p - 1;

        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }

        output[index] = x;

        for (int i = index + 1; i <= n; i++) {
            output[i] = arr[i - 1];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 4, 3, 17, 50, 12};
        int ele = 20;
        int index = 5;

        int[] newArr = insertingAnArray(arr, ele, index);
        System.out.println(Arrays.toString(newArr));
    }
}
