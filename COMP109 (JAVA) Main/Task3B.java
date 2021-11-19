// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Çakar (October 10th, 2021)

// Imports Scanner class for console/user input
import java.util.Scanner;

/* A program that takes the input of users weight and height
 * calculates the BMI value, displays the BMI value
 * and shows the comparison to what the BMI value is classed as
 */


public class Task3B {

    public static void main(String[] Strings) {
    	// initializes scanner object
        Scanner input = new Scanner(System.in);
        // prompts the user to input their weight into the console
        System.out.print("Input weight in kilograms: ");
        double weight = input.nextDouble();
        // prompts the user to input their height into the console
        System.out.print("Input height in meters: ");
        double height = input.nextDouble();
        // input closed
        input.close();
        // new double created that calculates the bmi by the ratio of weight to height squared
        double BMI = weight / (height * height);
        // displays the first line showing the bmi of the person
        System.out.print("Body Mass Index is: " + BMI + ", you are:");
        // conditionals that compare the bmi to different conditions and prints the corresponding result
        if (BMI < 18.5) {
        	System.out.print(" underweight");
        }else if (BMI < 25 && BMI>18.5) {
        	System.out.print(" normal");
        }else if (BMI < 30) {
        	System.out.print(" overweight");
        }else {
        	System.out.print(" obese");
        }
    }
}
