import java.util.Scanner;

public class Population{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of years:");
	int year = input.nextInt();
	
	double population = 312032486;
	int inYears = (int)  population * (year);

	System.out.print(inYears);

	}
}
	