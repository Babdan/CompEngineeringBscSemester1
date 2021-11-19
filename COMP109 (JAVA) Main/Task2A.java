
public class Task2A {

	public static void main(String[] args) {
		// initial condition
		int X1 = 5;
		int X2 = 3;
		System.out.println(" X1's initial value is " + X1 + " & X2's initial value is " + X2);
		System.out.println("--------------------------------------------------");
		//Altered condition
		int Temp = 5;
		X1 = X2;
		X2 = Temp;
		
		//Results
		System.out.println(" X1's 'swapped' value is " + X1 + " & X2's 'swapped' value is " + X2);
	}

}
