package com.functionsAndMethods;

public class PrimeNumbers {
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int num = 2;
        boolean result = isPrime(num);
        if(result){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
