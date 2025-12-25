import java.util.Scanner;

public class Year{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter the number of Minutes:");
	long minutes = input.nextLong();
	
	long year = minutes / 365;

	System.out.printf("%",minutes);

	}
} 