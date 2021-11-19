// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Mustafa Ersen (November 14th, 2021)

import java.util.Scanner;// importing java scanner utility
//a program that reads a positive integer from the user, finds all the prime factors of that number, and prints them
public class Lab6 {
//main method that obtains user input and prints the prime factorizations
	public static void main(String[] args){
		//opening scanner and prompting user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int userInp = input.nextInt();
		//scanner closed
		input.close();
		//new integer initialized for ease of use that calls computeNumDigits method and substitutes user input
		int userNumDigit = computeNumDigits(userInp);
		System.out.println("Prime factorization for " + userInp + ":");
		//for loop used to repeat to find every prime number from to and above
		//new integer a initialized, action repeats until a is smaller than or equal to user input, and every time it adds 1 to a
		for(int a = 2; a <= userInp; a++){
			//while loop used so that if the number is divided by the same prime it will not repeat and a wont be affected by the for loop
			while(userInp % a == 0){
				//result printed with format matching example output
				System.out.printf("%" + userNumDigit + "d | %d\n", userInp, a);
				userInp = userInp / a;//used to avoid non-stopping loop, by dividing factor found in userInp
                }
            }
		//console printout to match example given
		System.out.printf("%" + userNumDigit + "d | ", 1);
    }//method that returns the number of digits of a given number
    public static int computeNumDigits(int num){
        //deceleration of variables, program will not work if value less than 1 given
    	int userNumDigit = 1;
    	//removing the necessity for casting, if there is a fraction
        num = num - (num%10);
        //loops until value given value is a decimal
        while ((num / 10) != 0){
            //removes a digit
        	num = num / 10;
        	//adds decreasing count to while loop
            userNumDigit++;
        }return userNumDigit;
    }
}
