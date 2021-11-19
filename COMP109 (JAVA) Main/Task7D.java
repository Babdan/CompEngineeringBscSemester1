package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 6th, 2021)

//import scanner library
import java.util.Scanner;

public class Task7D {
    //main method that obtains user input for the desired nth term to be called on the fibNum method
    public static void main(String[] args) {
        System.out.println("Enter a number to find the nth term of the Fibonacci sequence: ");
        //scanner object opened
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibNum(n));
    }
    //method that returns the nth fibonacci number with a for statement
    public static int fibNum (int index) {
        int num1 = 1;
        int num2 = 1;
        int temp;
        for (int i = 1; i<index-1; i++) {
            temp = num2; //temp:2
            num2 = num1 + num2; //num2: 3
            num1 = temp; //num1: 2
        }
        return num2;
    }

}
