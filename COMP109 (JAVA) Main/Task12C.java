package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 14th, 2021)

import java.util.Arrays;//importing the Arrays class

public class Task12C {
    //main method that calls generateArray and then uses the return value to call selectionSort and prints the result
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("The generated array is: " + Arrays.toString(arr));
        int[] srtArr = selectionSort(arr);
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
    //array that self sorts
    public static int [ ] selectionSort(int[] arr) {
        int min;
        int min_idx;
        for (int i = 0; i < arr.length; i++) {
            min=arr[i];
            min_idx=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
}
