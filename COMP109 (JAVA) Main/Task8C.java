// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 14th, 2021)

public class Task8C {
//A program that calculates the sum of digits of a given number, using a for loop (as while loop was done in class)
	//main method that takes user input to call the sumDigits method and prints output
    public static void main(String[] args) {
        //scanner opened to take user input
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        //input taken and input closed after
        int num = input.nextInt();
        input.close();
        //results printed out on console by calling sumDigits method
        System.out.println("Sum of digits is: " + sumDigits(num));
    }
    //method with a for loop that calculates the sum of digits of a given number
    public static int sumDigits(int num){
    	int sum = 0;
        //for loop that has new integer i equaling to num, it loops until i is bigger than 0, and each time it divides i by 10
    	for(int i = num; i > 0; i = i / 10){
            //10 remainder of i is added to the sum value
    		sum += i % 10;
        }
        return sum;
    }
}
