import java.util.Scanner;

public class Average{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter V0:");
	double intial = input.nextDouble();

	System.out.print("Enter V1:");
	double ending = input.nextDouble();

	System.out.print("Enter t0:");
	double time = input.nextDouble();

	double acceleration = (intial - ending) / time;
	
	System.out.printf("The average acceleration is %.4f", acceleration);
	}
}