package com.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    // Given an array and 2 indices b and c, reverse the elements of the given array form index b to and index c
    public static void reverseAnArrayGivenIndices(int[] arr, int b, int c){
        int si = b;
        int ei = c;

        while (si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    // Reverse all the elements by making changes in the original array
    public static void reverseAnArray(int[] arr){
        int si = 0;
        int ei = arr.length-1;

        while (si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
//        int[] arr = {70, 30, 20, 1, 4, 14, 2};
//        reverseAnArray(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arr = {7, 8, 2, 10, 7, 6, 8, 10, 14, 20, 18, 19, 21};
        int b = 3;
        int c = 9;
        reverseAnArrayGivenIndices(arr, b, c);
        System.out.println(Arrays.toString(arr));
    }
}
