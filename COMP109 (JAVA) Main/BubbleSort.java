package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 23rd, 2021)

import java.util.Arrays;//importing the Arrays class

public class BubbleSort {
    //main method that calls generateArray and then uses the return value to call bubbleSort and prints the result
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("The generated array is: " + Arrays.toString(arr));
        int[] srtArr = bubbleSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(srtArr));
    }

    //method that generates a random array of size 10
    public static int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //array that bubble sorts
    public static int[] bubbleSort(int[] array) {
        int i, j, temp;
        boolean doesPass = true;
        for (i = 1; i < array.length && doesPass; i++) {
            for (j = 0; j < array.length - i; j++) {
                doesPass = false;
                if (array[ j ] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    doesPass = true;
                }
            }
        }
        return array;
    }
}