package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 23rd, 2021)

import java.util.Scanner;//importing the scanner class

public class Task9A {
    //main program that takes user input calls isPrime function and prints the result
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = new Scanner(System.in).nextInt();//initializes new scanner object and takes user input
        if (isPrime(num)){//calls isPrime function and sees if returns true
            System.out.println(num + " is a prime number.");
        }else{//if returns false
            System.out.println(num + " is not a prime number.");
        }
    }
    //optimized boolean java method that checks if a number is prime or not
    public static boolean isPrime(int num) {
        if (num < 2)//optimized condition that checks if the number is less than 2
            return false;
        else if (num == 2 || num ==3)//special case for 2, and 3
            return true;
        else {
            for (int i = 3; i <= Math.sqrt(num)+2; i+=2) {//optimized so that does not divide by even numbers
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
}
