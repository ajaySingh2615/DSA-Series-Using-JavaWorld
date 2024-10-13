package com.arrays;

public class IncreasingOrder {
    // WAF that returns true if array is in increasing order otherwise return false
    public static boolean increasing(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8};
        boolean result = increasing(nums);
        if(result){
            System.out.println("Increasing");
        }else{
            System.out.println("Not Increasing");
        }
    }
}
