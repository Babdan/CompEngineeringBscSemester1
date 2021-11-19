package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 6th, 2021)

//import math and scanner library for user input and math functions
import java.lang.Math;
import java.util.Scanner;

public class Task7C {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * (100 - 1) + 1);
        System.out.println("Guess an integer between 1 and 100:");
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        while (response != randomNum) {
            if (response < randomNum) {
                System.out.println("Your response should be bigger.");
                response = input.nextInt();
            } else{
                System.out.println("Your response should be smaller.");
                response = input.nextInt();
            }
        }
        System.out.println("Congratulations! You are correct!");
    }
}
