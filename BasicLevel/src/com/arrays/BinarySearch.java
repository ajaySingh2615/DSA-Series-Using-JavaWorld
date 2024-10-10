package com.arrays;

public class BinarySearch {
    public static int binarySearchAlgo(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50};
        int key = 30;

        int index = binarySearchAlgo(elements, key);
        if (index == -1) {
            System.out.println(key + " is not found");
        } else {
            System.out.println(key + " is found at index " + index);
        }
    }
}
