package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (December 25th, 2021)

// The Sieve of Eratosthenes is a technique for finding all the prime numbers up to a given last number.
import java.util.Scanner;//import scanner class

public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompting user for input
        System.out.print("Kindly enter the number to be checked up to: ");
        int lastNumber = input.nextInt();
        input.close();
        //isPrime is false initially and number that are not prime will pass as true.
        boolean[] isPrime = new boolean[lastNumber + 1];
        //looping through to lastNumber
        for (int num = 2; num * num <= lastNumber; num++) {
            for (int i = num * num; i <= lastNumber; i += num)
                isPrime[i] = true;
        }
        System.out.println("All the prime numbers up to " + lastNumber + " are");
        //displays all the prime numbers
        for (int i = 2; i <= lastNumber; i++){
            if (!isPrime[i])
                System.out.print(i+" ");
        }
    }
}
