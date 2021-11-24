package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 23rd, 2021)

import java.util.Scanner;//importing the scanner class

public class Task9B {
    //main method that obtains user input and calls isPerfect method and prints result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creating a new scanner object
        System.out.print("Enter a number to check whether its perfect: ");//prompting user to enter a number
        int number = scanner.nextInt();//obtaining user input
        if (isPerfect(number)){//calling isPerfect method and if it returns true, prints that it is perfect
            System.out.println("The number is perfect.");
        }else{//if it returns false, prints that it is not perfect
            System.out.println("The number is not perfect.");
        }
    }
    //optimized boolean method that checks if a number is perfect or not
    public static boolean isPerfect(int num){
        if(num < 1)//special condition
            return false;
        int sum = 0;//initializing sum variable
        for(int i = 1; i <= num/2; i++){//looping through all numbers from 1 to num/2
            if(num % i == 0) {//if the number is divisible by i, add i to sum
                sum += i;
            }
        }
        return(sum == num);//returns true if sum is equal to num, false otherwise
    }
}
