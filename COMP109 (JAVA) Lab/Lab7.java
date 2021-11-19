// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Mustafa Ersen (November 17th, 2021)

import java.util.Scanner;// importing java scanner utility
public class Lab7 {
//A program that reads a sequence of integers from the console, finds the largest number in the sequence as well as its count, and prints the result
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int max = 0;//stores the largest number encountered so far
        int count = 0;//stores the number of the occurrences of the value max
        int userInput;//stores user entered values
        System.out.print("Enter a sequence of integers (enter 0 to end the input): ");//prompts user to enter values
        userInput = input.nextInt();
        if(userInput == 0){//if only 0 was entered without any other values
            System.out.println("Only sentinel value (0) was entered");
        }else{
            while(userInput != 0){//loops until user enters sentinel value
                if(userInput > max){//if number greater than max, count resets to 1 and new max value registered
                    count = 1;
                    max = userInput;
                }else if (userInput == max)//if the number is equal to max, count is increased by 1
                    count++;
                userInput = input.nextInt();//next input taken
            }
            System.out.println("max = " + max + " with " + count + " occurrences");// after while loop condition is not satisfied, it prints max along the count
        	}
        input.close();//input closed
		}
}
