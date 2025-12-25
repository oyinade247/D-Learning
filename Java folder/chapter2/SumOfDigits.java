import java.util.Scanner;

public class SumOfDigits{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter any number between 0 - 1000:");
	int number = input.nextInt();

	int save = 0;
	

	int reminder = number % 10;
	save = reminder + save;
	number = number /10;

	reminder = number % 10;
	save = reminder + save;
	number = number / 10;

	reminder = number % 10;
	save = reminder + save;
		
    System.out.print(save);
	

	}
}