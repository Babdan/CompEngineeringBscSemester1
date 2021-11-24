package com.company;

import java.util.Scanner;//scanner library imported

public class Task9AWhile {
    //main method that takes user input calls isPrime method and prints out the result
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is prime: ");//prompts user to enter a number
        int userInput = new Scanner(System.in).nextInt();//takes user input
        if (isPrime(userInput)) {//calls isPrime method and sees if returns true
            System.out.println("The number is prime");//prints out number is prime
        } else {//if isPrime method returns false
            System.out.println("The number is not prime");//prints out number is not prime
        }
    }
    //method that checks if a number is a prime number using a while loop
    public static boolean isPrime(int number) {
        int i = 2;//sets i to 2
        while (i < number) {//while i is less than number
            if (number % i == 0) {//if number is divisible by i
                return false;
            }
            i++;//increments i
        }
        return true;//returns true if number is prime
    }
}
