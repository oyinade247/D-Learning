import java.util.Scanner;

public class Population{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of years:");
	double year = input.nextDouble();
	
	double population = 312_032_486;
	double inYears = 312_032_486 * year;

	System.out.print(inYears);

	}
}
	