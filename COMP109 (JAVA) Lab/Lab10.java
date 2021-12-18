package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (December 18th, 2021)

//A program that computes the area of a triangle given its corner points.
//Scanner class
import java.util.Scanner;
//Arrays class
import java.util.Arrays;

public class Lab10 {
    //Main method
    public static void main(String[] args) {
// create a 2-D array for the corner point coordinates of the triangle
// 3 corner points -> 3 rows and 2 coordinates (x and y) -> 2 columns
        double[][] cornerPoints = new double[3][2];
// prompt the user to enter the corner point coordinates for a triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the corner points as x1 y1 x2 y2 x3 y3: ");
// read the user entered information into the 2-D array cornerPoints
        for (int i = 0; i < cornerPoints.length; i++) // for each corner point
            for (int j = 0; j < cornerPoints[i].length; j++) // read x and y
                cornerPoints[i][j] = input.nextDouble();
        input.close();
// print the user-entered corner point coordinates on the console
        for (int i = 1; i <= cornerPoints.length; i++) { // for each corner point
// create a 1-D array for the point (a demonstration of array of arrays:
// a 2-D array is a 1-D array in which each element is another 1-D array)
            double[] point = cornerPoints[i - 1];
// print the coordinates of the point using the Arrays.toString method
            System.out.print("x and y coordinates for corner point " + i + ": ");
            System.out.println(Arrays.toString(point));
        }
// compute the side lengths of the triangle by using the computeSideLengths
// method for the corner point coordinates stored as cornerPoints
        double[] sides = computeSideLengths(cornerPoints);
// print the computed side lengths by using the Arrays.toString method
        System.out.println("Computed side lenghts: " + Arrays.toString(sides));
// compute and print the area of the triangle based on the Heron's formula
// by using the computeArea method for the side lengths stored as sides
        double area = computeArea(sides);
        System.out.println("The area of the triangle is " + area + ".");
    }
    //computeSideLengths method
    public static double[] computeSideLengths(double[][] cornerPoints) {
        //single dimensional array for the side lengths
        double[] sides = new double[3];
        //calling the distance method to compute the side lengths
        for (int i = 0; i < sides.length; i++) //for all the sides
            sides[i] = distance(cornerPoints[i], cornerPoints[(i + 1) % 3]);
        return sides;
    }
    //computeArea method
    public static double computeArea(double[] sides) {
        //calculates the area of the triangle using Heron's formula
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }
    //distance method
    public static double distance(double[] point1, double[] point2) {
        //calculates the distance between two points using the Pythagorean theorem
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) +
                Math.pow(point1[1] - point2[1], 2));
    }
}
