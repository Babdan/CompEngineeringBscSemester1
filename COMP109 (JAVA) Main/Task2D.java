import java.util.Scanner;

public class Task2D {
	public static void main(String[] args) 
	  {
		
	    Scanner input = new Scanner (System.in);
	    System.out.println("Input the amount of money in TRY: ");
	    double moneyTRY = input.nextDouble();
	    double moneyUSD = moneyTRY * 0.11;
	    double moneyEUR = moneyTRY * 0.097;
	    double moneyGBP = moneyTRY * 0.083;
	    double moneyJPY = moneyTRY * 12.54;
	    double moneyRUB = moneyTRY * 8.20;
	    double moneyCAD = moneyTRY * 0.14;
	    input.close();
	    System.out.println();
	    System.out.println(moneyTRY + " TRY is equal to " + moneyUSD + " USD" );
	    System.out.println(moneyTRY + " TRY is equal to " + moneyEUR + " Euro" );
	    System.out.println(moneyTRY + " TRY is equal to " + moneyGBP + " GBP" );
	    System.out.println(moneyTRY + " TRY is equal to " + moneyJPY + " Yen" );
	    System.out.println(moneyTRY + " TRY is equal to " + moneyCAD + " CAD" );
	    System.out.println(moneyTRY + " TRY is equal to " + moneyRUB + " Ruble" );

	  }
}
