package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

import java.util.Arrays;//importing the Arrays class
import java.util.Scanner;//importing the Scanner class

public class Task11B {
    //double 3D (2-3-2) array with values assigned by user
    public static void main(String[] args) {
        double[][][] array3D = new double[2][3][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("Enter value for array[" + i + "][" + j + "][" + k + "]");
                    Scanner input = new Scanner(System.in);
                    array3D[i][j][k] = input.nextDouble();
                }
            }
        }
        System.out.println(Arrays.deepToString(array3D));
    }
}
