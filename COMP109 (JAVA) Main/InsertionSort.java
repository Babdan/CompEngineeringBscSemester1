package com.company;

// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 23rd, 2021)

import java.util.Arrays;

public class InsertionSort {
    //main method that calls generateArray and then uses the return value to call insertionSort and prints the result
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("The generated array is: " + Arrays.toString(arr));
        int[] srtArr = insertionSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(srtArr));
    }

    //method that generates a random array of size 10
    public static int[] generateArray() {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //array that insertion sorts
    public static int[] insertionSort(int [] arrayX ) {
        int currentElement;
        int j;
        for (int i = 1; i < arrayX.length; i++) {
            currentElement = arrayX [i];
            j = i - 1;
            while (j >= 0 && arrayX[j] > currentElement) {
                arrayX [j + 1] = arrayX [j];
                j = j - 1;
            }
            arrayX [j + 1] = currentElement;
        }
        return arrayX;
    }
}
