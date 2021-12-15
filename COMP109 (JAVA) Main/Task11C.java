package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 11th, 2021)
//*Submitted late due to Erasmus+ Conference*

import java.util.Arrays;//importing the Arrays class
import java.util.Scanner;//importing the Scanner class

public class Task11C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] pointName = {"A", "B", "C", "D", "E", "F"};
        double[][] pointCoordinate = new double[6][2];
        for (int i = 0; i < pointCoordinate.length; i++) {
            System.out.print("Enter the coordinates of point " + pointName[i] + ": ");
            for (int a = 0; a < pointCoordinate[i].length; a++) {
                pointCoordinate[i][a] = input.nextDouble();
            }
        }
        input.close();
        System.out.println("Coordinates are: " + Arrays.deepToString(pointCoordinate));
        double dist;
        double minDistance = 999;
        int min_i = 0;
        int min_j = 1;
        for (int i = 0; i < pointName.length; i++) {
            for (int j = i + 1; j < pointName.length; j++) {
                dist = distanceBetweenPoints(pointCoordinate[i][0], pointCoordinate[i][1], pointCoordinate[j][0], pointCoordinate[j][1]);
                if (minDistance > dist) {
                    minDistance = dist;
                    min_i = i;
                    min_j = j;
                }
            }
        }
        System.out.println("Min distance is in between: " + pointName[min_i] + " and " + pointName[min_j]);
    }
    public static double distanceBetweenPoints( double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}