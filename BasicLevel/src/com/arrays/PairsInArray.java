package com.arrays;

public class PairsInArray {
    // pairs in array
    public static int pairsInArray(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 3, 6};
        int k = 8;
        int result = pairsInArray(arr, k);
        System.out.println(result);
    }
}
