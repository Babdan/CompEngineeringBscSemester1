package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

//import scanner
import java.util.Scanner;

public class Task10B {
    public static void main(String[] args) {
        //main method that takes user array and calls averageArray and sumArray
        int[] array = new int[50];
        //take input array from user using a loop
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value for array[" + i + "]");
            array[i] = input.nextInt();
        }
        input.close();
        System.out.println("The sum of the array is: " + sumArray(array));
    }
//method that gets array with 50 values and calculates the sum
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {//parametric array
            sum += array[i];
        }
        return sum;
    }
}
