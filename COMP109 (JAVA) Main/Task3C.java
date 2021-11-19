//By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Çakar (October 10th, 2021)

//Imports Scanner class for console/user input
import java.util.Scanner;

/*
 * A program that determines if a given year is a leap year or not
 */

public class Task3C {
    
  public static void main(String[] args){
	  	// initializes scanner object
        Scanner in = new Scanner(System.in);
        // prompts the user to enter a year
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        // input closed
        in.close();
        /* determinig whether the year is a leap year or not
         * It should be divisible by 4 but not 100
         * OR
         * divisible by 400
         */
        if (year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}