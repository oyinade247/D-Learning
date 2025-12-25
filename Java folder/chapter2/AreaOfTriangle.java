import java.util.Scanner;

public class AreaOfTriangle{
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

	System.out.print("Enter X3: ");
	double fifthPoint  = input.nextDouble();

	System.out.print("Enter Y3: ");
	double sixPoint  = input.nextDouble();

	double firstSide = (thirdPoint - firstPoint) + (fourthPoint - secondPoint);
	double firstSidePower = Math.sqrt(firstSide);

	double secondSide = (fifthPoint - thirdPoint) + (sixPoint - fourthPoint);
	double secondSidePower = Math.sqrt(secondSide);

	double thirdSide = (fifthPoint - firstPoint) + (sixPoint - secondPoint);
	double thirdSidePower = Math.sqrt(thirdSide);

	double totalSidePower = (firstSidePower + secondSidePower + thirdSidePower) / 2;

	double sideBoth = totalSidePower * (totalSidePower - firstSidePower)* (totalSidePower - secondSidePower)*(totalSidePower - thirdSidePower);
	
	double side = Math.sqrt(sideBoth);
	System.out.print(totalSidePower );
	
	}
}