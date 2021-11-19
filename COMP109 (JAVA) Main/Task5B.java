// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 29th, 2021)
import java.util.Scanner;// import Scanner class for user input

public class Task5B {

	//main method that takes user input and prints results on the console
	public static void main(String[] args) {
		// prompting the user for input
		System.out.print("Please input the radius of a circle: ");
		Scanner input = new Scanner(System.in);
		double radiusIn = input.nextInt();
		input.close();
		if (radiusIn < 0) {
			System.out.println("Review your input; negative radius written");
		}else {
		// method called to calculate the perimeter and area then displays them on console
		System.out.print("The circle has a perimeter of " + perimeterOfCircle(radiusIn) + " and an area of " + areaOfCircle(radiusIn));
			}
	}//method that calculates the perimeter
	public static double perimeterOfCircle (double radius) {
		return (2*Math.PI*radius);
	}//method that calculates the area
	public static double areaOfCircle (double radius) {
		return (radius*radius*Math.PI);		
	}
}
