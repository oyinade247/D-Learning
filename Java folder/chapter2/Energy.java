import java.util.Scanner;
public class Energy {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilogram:");	
	double water = input.nextDouble();

	System.out.print("Enter initial temperature:");	
	double initial = input.nextDouble();
		
	System.out.print("Enter final temperature:");	
	double lastTemp = input.nextDouble();

	double quantityOfWater = water * (initial - lastTemp) * 4184;


	System.out.printf("The energy needed is%.2f ",quantityOfWater);
	}
}


	
	
	