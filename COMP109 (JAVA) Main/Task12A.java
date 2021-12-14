package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 14th, 2021)

import java.util.Arrays;//importing the Arrays class
import java.util.Scanner;//importing the Scanner class

public class Task12A {
    //double 3D (2-2-2) array with values assigned by user
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        double[][][] array3D = new double[2][2][2];
        for(int i = 0;  i < array3D.length; i++) {
            for (int a = 0; a< array3D[i].length; a++) {
                for (int k = 0; k < array3D[i][a].length;k++) {
                    System.out.print("Please give an input value less than 10: ");
                    x = input.nextDouble();
                    while (x > 10) {
                        System.out.print("Please try another input value less than 10: ");
                        x = input.nextDouble();
                    }
                    array3D[i][a][k] = x;
                }
            }
        }
        input.close();
        System.out.println(Arrays.deepToString(array3D));
    }
}
