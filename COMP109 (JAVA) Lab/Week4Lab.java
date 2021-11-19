//By Bogdan Itsam Dorantes-Nikolaev, COMP109 Lab, Instructor: Mustafa Ersen (October 23rd, 2021)
import java.util.Scanner;// import Scanner class for user input
/*A program that displays the shipping cost of a package
* using a formula based on its weight.
*/
public class Week4Lab {
	//main method that obtains user input [that is sent to the printCost method that determines whether the package is shippable and its price]
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input opened
      //prompt the user to enter package weight
        System.out.print("Enter package weight: ");
        double inputWeight = input.nextDouble();
        input.close(); //input closed
        printCost(inputWeight); //calling displayCost method
    }
    public static boolean printCost(double weight) {//method that determines whether the package is shippable and its price
        if (weight > 0 && weight <= 2) {//makes sure that no values below 0 are entered.
            System.out.println("Shipping cost is $5");
        	return true;
        }else if (weight > 2 && weight <= 4) {
            System.out.println("Shipping cost is $9");
            return true;
        }else if (weight > 4 && weight <= 10) {
            System.out.println("Shipping cost is $15");
            return true;
        }else if (weight > 10 && weight <= 20) {
            System.out.println("Shipping cost is $21");
            return true;
        }else//if no case matches
        	System.out.println("The package cannot be shipped");
        	return false;
    }
}
