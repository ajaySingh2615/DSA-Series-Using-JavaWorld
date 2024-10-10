package com.basicQuestions;

public class ReverseAnNumber {
    public static void main(String[] args) {
        int num = 56789;
        int reverse = 0;

        while(num > 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /=10;
        }

        System.out.println("Reverse : " + reverse);
    }
}
