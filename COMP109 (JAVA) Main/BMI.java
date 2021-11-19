import java.util.Scanner;
public class BMI {
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height ");
        double height = input.nextDouble();
        System.out.println("Please enter your weight ");
        double weight = input.nextDouble();
        double BMI = bmiCalculator(height,weight) ;
        System.out.println("your BMI is " + BMI);
        //know the BMI status
        if (BMI < 18.5 ) {
            System.out.println("Underweight");
        }
        else if (BMI < 25 && BMI >18.5){
            System.out.println("Normal");
        }
        else if ( BMI > 25 && BMI < 30  ){
            System.out.println("Overweight");
        }
        else{
            System.out.println("obese");}

    }
        public static double bmiCalculator(double h,double w){
           return  w/(h*h);

        }

    }

