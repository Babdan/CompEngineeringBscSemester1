// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 29th, 2021)
import java.util.Scanner;// import of scanner classes for console/user input

public class Task5C {

	//main method that obtains user input and prints information on the console
	public static void main(String[] args) {
		// initializes scanner object
        Scanner input = new Scanner(System.in);
        // prompts the user to input their weight into the console
        System.out.print("Input weight in kilograms: ");
        double weightIn = input.nextDouble();
        // prompts the user to input their height into the console
        System.out.print("Input height in meters: ");
        double heightIn = input.nextDouble();
        // input closed
        input.close();
        // displays the first line showing the BMI of the person
        double BMI = bmiCalculator(heightIn,weightIn);
        System.out.print("Body Mass Index is: " + BMI + ", you are: ");
        // conditionals that compare the BMI to different conditions and prints the corresponding result
        if (BMI < 18.5) {
        	System.out.print("underweight");
        }else if (BMI < 25 && BMI>18.5) {
        	System.out.print("normal");
        }else if (BMI < 30) {
        	System.out.print("overweight");
        }else {
        	System.out.print("obese");
        }

	}// method created that calculates the BMI by the ratio of weight to height squared
	public static double bmiCalculator(double height, double weight) {
		return weight/(height * height);
	}
}
