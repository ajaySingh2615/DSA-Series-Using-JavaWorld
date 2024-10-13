package com.arrays;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // swap 2 numbers with the help of third variable
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
