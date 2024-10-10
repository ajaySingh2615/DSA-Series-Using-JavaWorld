package com.basicQuestions;

public class SumOfIntegers {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;

        while(num > 0){
            sum += num;
            num--;
        }

        System.out.println("Sum :  " + sum);
    }

}
