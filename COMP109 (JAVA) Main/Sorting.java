package com.company;

public class Sorting {
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
