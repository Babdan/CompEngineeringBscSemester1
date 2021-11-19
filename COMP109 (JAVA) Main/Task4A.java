//By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 17th, 2021)

import java.util.Scanner;
import java.lang.Math;

public class Task4A {

	public static void main(String[] args) {
		Scanner lotteryIn = new Scanner(System.in);
        System.out.print("Input a number between 10 and 100: ");
        int userLotteryNumber = lotteryIn.nextInt();
        lotteryIn.close();
        double generatedLotteryNumber = Math.ceil(Math.random() * 100);
        double firstGeneratedDigit = generatedLotteryNumber % 10;
        double secondGeneratedDigit = (generatedLotteryNumber - (generatedLotteryNumber % 10)) / 10;
        double firstUserDigit = userLotteryNumber % 10;
        double secondUserDigit = (userLotteryNumber - (userLotteryNumber % 10)) / 10;
        System.out.print("The lottery was: " + generatedLotteryNumber);
        		
        if (generatedLotteryNumber==userLotteryNumber)
        	System.out.print(" - You won $10000");
        else if (firstGeneratedDigit == secondUserDigit && secondGeneratedDigit == firstUserDigit)
        	System.out.print(" - You won $3000");
        else if (firstGeneratedDigit == secondUserDigit || secondGeneratedDigit == firstUserDigit || firstGeneratedDigit == firstUserDigit || secondGeneratedDigit == secondUserDigit)
        	System.out.print(" - You won $1000");
        else
        	System.out.print(" - You lost");
        }        	
}