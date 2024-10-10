package com.arrays;

public class LargestElement {
    public static int largestElement(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > maximum) maximum = ele;
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] elements = {10, 30, 60, 5, 15};

        int largest = largestElement(elements);
        System.out.println("The largest elements: " + largest);
    }
}
