package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

//scanner class
import java.util.Arrays;
import java.util.Scanner;

public class Task10C {
    //main method that takes user array and then uses the method to check if the given item is in the array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompts user to enter the array and stores it as an array
        System.out.print("Enter the array: ");
        int[] userArray= new int[10];
        for(int i = 0; i < 10; i++) {
            //reading array elements from the user
            userArray[i]=input.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(userArray));
        //prompts user to enter the item to be checked
        System.out.print("Enter the item to be checked: ");
        int userItem = input.nextInt();
        //if the item is in the array, it prints out "The item is in the array"
        if (checkIfItemIsInArray(userArray, userItem)) {
            System.out.println("The item '" + userItem + "' is in the array");
        }
        //if the item is not in the array, it prints out "The item is not in the array"
        else {
            System.out.println("The item '" + userItem + "' is not in the array");
        }
        input.close();
    }
    //boolean method that checks whether the given array has an given item or not
    public static boolean checkIfItemIsInArray(int[] arr, int item) {
        for (int j : arr) {
            if (j == item) {
                return true;
            }
        }
        return false;
    }
}
