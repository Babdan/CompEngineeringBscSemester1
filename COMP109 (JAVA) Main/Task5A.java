// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 29th, 2021)

// import of scanner class for console/user input
import java.util.Scanner;

public class Task5A {
//main method that takes in user inputs and displays text
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the year to be determined [if true, it is leap year; if false, then it is not a leap year]: ");
		int year = input.nextInt();
		input.close();
		System.out.println(isLeapYear(year));
	}// method that determines whether the given year is a leap year or not with 3 conditions
	public static boolean isLeapYear(int givenYear){
		if (givenYear % 400 == 0)//first condition
			return true;
		else if (givenYear % 4 == 00 && givenYear % 100 != 0)// second condition
			return true;
		else//third condition
			return false;
	}
}
