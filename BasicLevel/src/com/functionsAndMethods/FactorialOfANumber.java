package com.functionsAndMethods;

public class FactorialOfANumber {
    public static int factorialOfANumber(int num){
        int fact = 1;
        while (num != 0){
            fact *= num;
            num--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;

        int result = factorialOfANumber(num);
        System.out.println(result);
    }
}
