package com.arrays;

public class LinearSearch {
    public static int linearSearchAlgo(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int index = linearSearchAlgo(arr, key);
        if(index == -1){
            System.out.println(key + " is not found in given array");
        }else{
            System.out.println(key + " is found at index " + index);
        }
    }
}
