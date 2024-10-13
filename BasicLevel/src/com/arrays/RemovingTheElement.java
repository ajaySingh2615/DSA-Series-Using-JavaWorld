package com.arrays;

import java.util.Arrays;

public class RemovingTheElement {
    public static int[] removeThat(int[] arr, int position) {
        int[] output = new int[arr.length - 1];
        int index = position - 1;

        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }

        for (int i = index; i < arr.length-1; i++) {
            output[i] = arr[i + 1];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {60, 30, 40, 10, 3, 30, 5, 2, 8};
        int position = 5;
        int[] newArray = removeThat(arr, position);
        System.out.println(Arrays.toString(newArray));
    }
}
