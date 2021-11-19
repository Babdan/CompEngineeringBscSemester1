//By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 17th, 2021)
import java.util.Scanner;
public class Task4B {

	public static void main(String[] args) {
        System.out.print("Input 3 digit value");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        in.close();
        int firstDigit = value/100;
        int secondDigit = (value % 100)/10;
        int thirdDigit = value%10;
        int digitSum = firstDigit + secondDigit + thirdDigit;
        System.out.println("The sum of the 3 digits of " + value + " is " + digitSum);
	}
}