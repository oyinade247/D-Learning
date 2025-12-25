import java.util.Scanner;

public class DistanceOfTwoPoint{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter X1: ");
	double firstPoint = input.nextDouble();

	System.out.print("Enter Y1: ");
	double secondPoint  = input.nextDouble();

	System.out.print("Enter X2: ");
	double thirdPoint  = input.nextDouble();

	System.out.print("Enter Y2: ");
	double fourthPoint  = input.nextDouble();

	double firstDistance = (thirdPoint - firstPoint);
	double firstDistancePower = Math.pow(firstDistance, 2);

	double secondDistance = (fourthPoint - secondPoint);
	double secondDistancePower = Math.pow(secondDistance, 2);

	double totalDistancePower = (firstDistancePower + secondDistancePower);

	double totalDistancePowerRoot = Math.pow(totalDistancePower, 0.5); 
	System.out.print(totalDistancePowerRoot);
	
	}
}