//By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (October 13th, 2021)

import java.util.Scanner; // import Scanner class for user input from the console

/* A program that checks whether a user-entered point is in the triangle 
 * [(-3,0)(0,4)(0,0)] or not and displays the result 
 */
public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompts the user to enter the 2 coordinates for the point
		System.out.print("Enter x and y coordinates for the point:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double eqn = ((4*x)/3)+4;
		input.close(); //scanner object closed
		//check if the inputed coordinates satisfy the conditions to be in the triangle
		if (x>=0) {
			System.out.println("Point (" + x + ", " + y + ")" + " is NOT in the triangle.");	
		}else if (y<=0) {
			System.out.println("Point (" + x + ", " + y + ")" + " is NOT in the triangle.");
		}else {
			if (y<=eqn) {
				System.out.println("Point (" + x + ", " + y + ")" + " is in the triangle.");
			}else {
				System.out.println("Point (" + x + ", " + y + ")" + " is NOT in the triangle.");
			}
		}
	}
}
