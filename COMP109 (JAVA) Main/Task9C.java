package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 23rd, 2021)

import java.util.Scanner;//importing the scanner class

public class Task9C {
    //main method that takes user input and calls isArmstrong method and prints the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creating a new scanner object
        System.out.print("Enter a number: ");//prompting the user to enter a number
        int num = input.nextInt();//taking the user input
        if (isArmstrong(num))//calling the isArmstrong method and if it returns true, prints that it is an armstrong number
            System.out.println("The number is an Armstrong number.");
        else//if it returns false, prints that it is not an armstrong number
            System.out.println("The number is not an Armstrong number.");
    }
    //method that determines if given number is an armstrong number or not
    public static boolean isArmstrong(int num) {
        int sum = 0;//initializing sum variable
        int temp = num;//initializing temp variable
        while (temp > 0) {//while temp is greater than 0
            int digit = temp % 10;//taking the remainder of temp divided by 10 and storing it in digit
            sum += digit * digit * digit;//multiplying all digits of temp by itself
            temp /= 10;//dividing temp by 10
        }
        return sum == num;//returning the value of sum and num
    }
}
