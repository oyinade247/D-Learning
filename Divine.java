import java.util.Scanner;
public class Divine{
	public static void main(String[] args ){
	Scanner collect = new Scanner(System.in);

	System.out.print("Enter five digits:");
	int number = collect.nextInt();

	String dividedNumber = "";

	
	int remainder = number % 10;
	dividedNumber = remainder + " " + dividedNumber;
	number = number / 10;


	remainder = number % 10;
	dividedNumber = remainder + " " + dividedNumber;
	number = number / 10;

	remainder = number % 10;
	dividedNumber = remainder + " " + dividedNumber;
	number = number / 10;

	remainder = number % 10;
	dividedNumber = remainder + " " + dividedNumber;
	number = number / 10;

	remainder = number % 10;
	dividedNumber = remainder + " " + dividedNumber;
	number = number / 10;


	
	System.out.print(dividedNumber );


	}
}