package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 6th, 2021)

//import math and scanner library for user input and math functions
import java.lang.Math;
import java.util.Scanner;

public class Task7B {

    //A program that generates 2 random integers between 0 and 9 and uses them for addition problem
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * (10-1) + 1);//first random integer generated
        int num2 = (int) (Math.random() * (10-1) + 1);//second random integer generated
        System.out.println("What is " + num1 + " + " + num2 + "?");//prompts user to enter sum of two random integers
        int sum = num1 + num2;
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        while (response != sum){//repeatedly prompts the user to enter sum of two random integers until the user enters the correct sum
            System.out.println("Sorry, but wrong response. Please try again.");
            response = input.nextInt();
        }
        System.out.println("Congratulations! You are correct!");//if while loop does not satisfy, the user is informed that the sum is correct
        input.close();
    }
}
