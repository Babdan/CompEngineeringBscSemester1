package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Mustafa Ersen (November 24th, 2021)

//A Program Displaying A Parallelogram-Shaped Number & Star Pattern On The Console
public class Lab8 {
    public static void main(String[] args){
        //initializing initial number of stars
        int n = 7;
        //outer loop for rows
        for (int row = 0; n >= row * 2 + 1; row++){
            //inner loop each element
            for (int blanks = 0; blanks < row; blanks++){// blanks is the number of spaces
                System.out.print(" ");
            }for (int asterisks = 0; asterisks < n - (row * 2); asterisks++){//prints the stars and takes off 2 for each row
                System.out.print("*");
            }for (int numbers = row * 2 + 1; numbers >= 1; numbers--){//prints the numbers
                System.out.print(numbers);
            }System.out.println();//prints a fresh line
        }
    }
}
