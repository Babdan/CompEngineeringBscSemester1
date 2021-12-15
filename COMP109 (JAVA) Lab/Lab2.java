//By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (October 07th, 2021)

import java.util.Scanner; //Imports Scanner class for console/user input


/*
A program that allows the user to input the subtotal and the tip rate (in %) from the console, then computes the tip and the total
 */

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print( " Enter the subtotal and the tip rate: ");
		double subtotal = myObj.nextDouble();
		double tip = myObj.nextDouble();

		subtotal = subtotal * ( tip / 100 ) + subtotal;
		
		System.out.print( "The tip is " + tip + " and the total is " + subtotal );
		
	}

}
