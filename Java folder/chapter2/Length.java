import java.util.Scanner;
public class Length {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter speed:");	
	double speedFast = input.nextDouble();

	System.out.print("Enter acceleration:");	
	double accelerate = input.nextDouble();

	double speedometer = speedFast * speedFast;
	double fast = 2 * accelerate;
	
	double minimumLength = speedometer / fast;

	System.out.printf("The minimum runway length is for this airplane is %.3f",minimumLength);
	}
}