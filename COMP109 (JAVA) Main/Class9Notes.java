package com.company;

public class Class9Notes {
    //method that calculates product of numbers from 1 to that number using while loop
    public static int product(int n) {
        int product = 1;
        int i = 1;
        while (i <= n) {
            product = product * i;
            i++;
        }
        return product;
    }
    //method with a for loop that calculates the sum of digits of a given number
    public static int sumDigits(int num){
        int sum = 0;
        for(int i = num; i > 0; i = i / 10){
            sum += i % 10;
        }
        return sum;
    }
    //method with a while loop that calculates the sum of digits of a given number
    public static int sumDigits2(int num){
        int sum = 0;
        int i = num;
        while(i > 0){
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }
    //boolean java method that checks if a number is prime or not
    public static boolean isPrime(int num){
        if(num < 2)
            return false;
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    //optimized boolean java method that checks if a number is prime or not
    public static boolean isPrimeV2(int num) {
        if (num < 2)
            return false;
        else if (num == 2)//special case for 2
            return true;
        else {
            for (int i = 3; i <= Math.sqrt(num)+2; i+=2) {//so that does not divide by even numbers
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
    //boolean method that checks if a number is perfect or not
    public static boolean isPerfect(int num){
        if(num < 1)
            return false;
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0)
                sum += i;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
    //boolean method that checks if a number is perfect or not V2
    public static boolean isPerfectV2(int num){
        if(num < 1)
            return false;
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0)
                sum += i;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
    //method that determines if given number is a narcissistic number or not
    public static boolean isNarcissistic(int num){
        int sum = 0;
        int temp = num;
        while(temp > 0){
            sum += Math.pow(temp % 10, numOfDigits(num));
            temp /= 10;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
    //method that determines the number of digits of a given number
    public static int numOfDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
