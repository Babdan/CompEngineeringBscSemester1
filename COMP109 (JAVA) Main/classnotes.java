//By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 22nd, 2021)

import java.util.Scanner;// import Scanner class for user input
import java.lang.Math.*;
public class classnotes {

	public static boolean isLeapYear(int givenYear){
	if (givenYear % 400 == 0)
		return true;
	else if (givenYear % 4 == 00 && givenYear % 100 != 0)
		return true;
	else
		return false;
	}
	public static boolean isEven (int number) {
		return (number % 2 == 0);
	}
	public static double areaOfCircle (double radius) {
		return (radius*radius*Math.PI);		
	}
	public static double perimeterOfCircle (double radius) {
	return (2*radius*Math.PI);
	}
	public static boolean isFineNumber(int number){
		return (((number%10 + (int)(number/10))*(number%10+(int)(number/10)) == number));
	}
	public static boolean isLeapYearV2(int givenYear){
		return ((givenYear % 400 == 0) || (givenYear % 4 == 00 && givenYear % 100 != 0));
		}
	public static double bmiCalculator (double height, double weight) {
		return (weight/(height*height));
	}
	public static void randomNumberGenerator () {
		double random = Math.random();
		if (random%2!=0)
			System.out.println("Heads");
		else
			System.out.println("Tails");
	}
	/*public static void taxPaying () {
		int status = 9;
		int income = 9;
		if (status == 0) {
			if (income < 8350)
				return (0.1* income);
			else if (income < 67900)
				return (0.15* income);
			else if (income < 82250)
				return (0.25*income);
				
		}
	}
	*/
	public static void switchexample() {
		switch (grade/10)
		case 9:
			System.
	}
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);//input opened
			System.out.print("Input the year value: ");
	        int year=input.nextInt();
	        input.close();//input closed
	      if (isLeapYear(year)==true){
	        System.out.println( "The year " + year + " is a leap year");
	    } else
	    	System.out.println( "The year " + year + " is a NOT leap year");
	    }
	}
