package com.arrays;

public class FindTheOccurrences {
    public static int findTheOccurrences(int[] arr, int k) {
        int occ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) occ++;
        }
        return occ;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 6, 6, 6, 4};
        int k = 6;

        int occ = findTheOccurrences(nums, k);
        System.out.println(occ);
    }
}
