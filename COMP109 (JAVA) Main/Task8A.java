// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 14th, 2021)

public class Task8A {
//A program that calculats the sum of numbers from n1 to n2 and returns the sum as integer, using a while loop.
	//main method that takes user input and calls sumBet method
    public static void main(String[] args) {
        //deceleration the variables
    	int start;
        int end;
        int sum;
        //opening an input scanner, getting user input
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the starting number: ");
        start = input.nextInt();
        System.out.print("Enter the ending number: ");
        end = input.nextInt();
        //closing input
        input.close();
        //new variables with inputed values called into the sumBet method
        sum = sumBet(start, end);
        //result printed out
        System.out.print("The sum of the numbers between " + start + " and " + end + " is " + sum);
    }

    //method that will calculates the sum of numbers from n1 to n2 and returns the sum as interger using while loop
    public static int sumBet(int n1, int n2) {
        //deceleration of variables
    	int sum = 0;
        int i = n1;
        //while loop that repeats i until it is smaller than or equal to n2
        while (i <= n2) {
            //current value of i added to sum
        	sum += i;
        	//1 is added to i
            i++;
        }
        //sum returned after while condition reached
        return sum;
    }
}
