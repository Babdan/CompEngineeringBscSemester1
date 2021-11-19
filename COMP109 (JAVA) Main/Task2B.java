import java.util.Scanner;

public class Task2B {
	public static void main(String[] args) 
	  {
		
	    Scanner input = new Scanner (System.in);
	    System.out.print("Input the first number: ");
	    int num1 = input.nextInt();
	    System.out.print("Input the second number: ");
	    int num2 = input.nextInt();
	    input.close();
	    int Sum = num1 + num2;
	    System.out.println();
	    System.out.println("The sum of "+num1+" and "+ num2+ " is " + Sum);
	
	  }
}
