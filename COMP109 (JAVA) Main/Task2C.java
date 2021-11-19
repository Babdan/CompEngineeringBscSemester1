import java.util.Scanner;

public class Task2C {
	public static void main(String[] args) 
	  {
		
	    Scanner input = new Scanner (System.in);
	    System.out.println("Input the temperature as degrees Celsius: ");
	    double celsius = input.nextDouble();
	    double fahrenheit = (celsius * 1.8) + 32;
	    input.close();
	    System.out.println();
	    System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " Fahrenheit" );
	  
	  }
}
