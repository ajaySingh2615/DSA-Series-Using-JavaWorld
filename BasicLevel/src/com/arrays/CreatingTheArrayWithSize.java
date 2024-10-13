package com.arrays;

public class CreatingTheArrayWithSize {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
}
