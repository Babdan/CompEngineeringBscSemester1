// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 14th, 2021)

public class Task8B {
//A program that calculates the product of the numbers from 1 to a given number, using a while loop
	//main method that takes user input and calls product method, and prints the result
    public static void main(String[] args) {
    	//prompting user to enter a value
        System.out.print("Enter a number: ");
        //opening a scanner and registering the entered value to a integer
        java.util.Scanner input = new java.util.Scanner(System.in);
        int userInput = input.nextInt();
        //input closed
        input.close();
        //result printed out in console
        System.out.println("The product of numbers from 1 to " + userInput + " is " + product(userInput));
    }
    //method that will calculate the product of numbers from 1 to the given number using a while loop
    public static int product(int number) {
        //deceleration of variables
    	int product = 1;
        //initial loop count
    	int i = 1;
        //repeating loop until given number is bigger than or equal to the loop count
        while (i <= number) {
            //product updated to be product multiplied by loop count
        	product *= i;
        	// 1 added to the current loop count
            i++;
        }//returns result
        return product;
    }
}
