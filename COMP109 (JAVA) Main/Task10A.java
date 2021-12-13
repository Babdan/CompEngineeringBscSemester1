package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

public class Task10A {
    //main method that prints result by calling primeDivisors method
    public static void main(String[] args) {
        int k = 1;
        for(int i=1;i<=1000;i++){
            int sum = primeDivisors(i);
            if(sum == i){
                System.out.println(k + ": " + i);
                k++;
            }
        }
    }

    //method that checks how many number have prime divisors are equal to the number itself from 1 to 1000
    public static int primeDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                if (isPrimeV2(i))
                    sum += i;
            }
        }
        return sum;
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
}
