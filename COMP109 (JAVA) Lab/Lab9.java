package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

import java.util.Arrays;//importing the Arrays class
public class Lab9 {
    //main method that calls randomArray and prints the array then calls insertionSort and prints the sorted array
    public static void main(String[] args) {
        int[] arr = randomArray(10);
        System.out.print("Random array: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();//for a cleaner look
        insertionSort(arr);
        System.out.print("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }
    //method that generates arrays in the range of 1-100
    public static int[] randomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
    //insertion sort method that sorts the array
    public static void insertionSort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
