//By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (October 17th, 2021)
public class Task4C {

	public static int maxOfThree(int n1, int n2, int n3){
		if(n1>=n2 && n1>=n3)
			return n1;
		else if (n2>=n1 && n2>=n3)
		return n2;
		else
			return n3;
	}
}