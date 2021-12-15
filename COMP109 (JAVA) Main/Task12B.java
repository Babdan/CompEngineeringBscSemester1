package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (December 14th, 2021)

public class Task12B {
    //2d array filled with grades of 30 students for 7 courses
    public static void main(String[] args) {
        int[][] grades = new int[30][7];
        //fill the 2d array with random grades
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int) (Math.random()*101);
            }
        }
        //loop through the array and print out the grades
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
        //loop through the array and find the average grade for each course
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            System.out.println("The average grade for student " + i + " is " + (sum / grades[i].length));
        }
        //calculates average grade for each course
        double[] courseAverage = new double[7];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                courseAverage[j] += grades[i][j];
            }
        }
        for (int i = 0; i < courseAverage.length; i++) {
            System.out.println("The average grade for course " + i + " is " + (courseAverage[i] / grades.length));
        }
    }
}
