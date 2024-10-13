package com.arrays;

public class SumOfNumbers {
    //write a function that returns sum of elements of an array
    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }


    public static void main(String[] args) {
        int[] elements = {20, 30, 50, 100};

        int sum = sumOfElements(elements);
        System.out.println(sum);
    }
}
