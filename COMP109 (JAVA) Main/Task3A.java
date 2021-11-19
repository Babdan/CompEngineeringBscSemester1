// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Çakar (October 10th, 2021)

// import of Scanner & Random classes for console/user input and random variable generation
import java.util.Random;
import java.util.Scanner;

/* A program that randomly generates two single-digit integers
 * and displays a question prompting the user to input the sum of the two single digit integers
 * and then checks whether the answer is correct, if not it shows the correct response.
 */

public class Task3A {

	public static void main(String[] args) 
	  {
		// initializes Random and Scanner objects
		Random random = new Random();
	    Scanner input = new Scanner (System.in);
	    // 2 integers are initialized and 2 random single digit numbers are assigned to them with a upperbound of 10
		int randomInt1 = random.nextInt(10);
		int randomInt2 = random.nextInt(10);
		// displays a line prompting the user to input the sum of the two randomly generated integers
	    System.out.print("What is the sum of " + randomInt1 + " and " + randomInt2 + "? ");
	    int response = input.nextInt();
	    // input closed
	    input.close();
	    // calculation of the sum of the two integers is done
	    int sum = randomInt1 + randomInt2;
	    // if the response matches the calculated the sum, it displays correct response
	    if (sum == response) {
	      System.out.println("Correct response!");
	    // if the response does not match the calculated sum, it displays that it is an incorrect response and shows the correct sum value
	    } else {
	      System.out.println("Incorrect response, the correct response is: " + sum);
	    		}
	  }
}
