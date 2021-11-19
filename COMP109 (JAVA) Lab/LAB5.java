//By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (October 30th, 2021)

import java.lang.Math;// Math library imported for Math.sqrt function
import java.util.Scanner; //Scanner library imported for obtaining user inputs

/* A program that reads three edges of a triangle from the user,
 * checks if the given edges form a valid triangle using the isValid method,
 * displays 'Invalid input.' if the method returns false,
 * otherwise computes the perimeter by using the getPerimeter method
 *  and the area by using the getArea method and displays the results 
*/

public class Lab5 {

	//main method which takes user inputs, calls isValid to check if triangle is valid then print the perimeter and area onto the console.
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);//Scanner object created
	//prompting the user to input the points
	System.out.print("Enter a, b and c: ");
	int side1 = input.nextInt();
    int side2 = input.nextInt();
    int side3 = input.nextInt();
    input.close();//closing the scanner
    if (isValid(side1,side2,side3)){//checking if inputed points are valid by calling isValid function
        System.out.println("The perimeter of your triangle is " + getPerimeter(side1,side2,side3) + ".");
        System.out.println("The area of the triangle is " + getArea(side1,side2,side3) + ".");
    }else
        System.out.println("Invalid input.");// if inputed points are not valid
	}
	public static boolean isValid(int side1, int side2, int side3) {
		 if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
	            return false;
	     else
	            return true;
	}
	public static int getPerimeter(int side1, int side2, int side3) {
		return side1+side2+side3;
	}
	public static double getArea(int side1, int side2, int side3) {
		double s = (side1 + side2 + side3)/2.0;
		return Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
	}
}
