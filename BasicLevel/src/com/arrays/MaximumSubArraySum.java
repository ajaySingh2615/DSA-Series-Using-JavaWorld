package com.arrays;

public class MaximumSubArraySum {
    public static int maximumSubArraySumUsingBruteForce(int[] arr){
        int sum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(maximumSum < sum){
                    maximumSum = sum;
                }
            }
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        int[] elements = {1, -2, 6, -1, 3};

        int sum = maximumSubArraySumUsingBruteForce(elements);
        System.out.println("The maximum sum is : " + sum);
    }
}
