import java.util.Scanner;

public class Convert{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter any number in pounds ");
	double pounds = input.nextDouble();
  	
	double kilo = pounds * 0.454;
	
	System.out.printf("%f pounds is %f kilograms ",pounds, kilo);
	}
}	