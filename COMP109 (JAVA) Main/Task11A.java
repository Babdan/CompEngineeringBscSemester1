package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

public class Task11A {
    //main method
    public static void main(String[] args) {
        //2 dimensional array 7 to 8 composed of random integer numbers between 15 and 77 both included
        int[][] array = new int[7][8];
        //initialize the array with random numbers
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 77 + 15);
                    System.out.print(array[i][j]+" ");
                }

            }
    }
}