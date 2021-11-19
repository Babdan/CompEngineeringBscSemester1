// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 29th, 2021)
public class Task5D {

	//main method that prints out heads or tails
	public static void main(String[] args) {
	for (int i =0; i<=4; i++)//for statement that makes the program run 5 times
	    System.out.print(headsOrTails());//heads or tails method being called
	}
	public static String headsOrTails () {//heads or tails method
        String hOrt = "";
        double lottery = Math.random();//random method
        if (lottery <= 0.5){//50% probability
        	hOrt = "H";
        } else {
        	hOrt = "T";
        }
       return hOrt;
	}
}