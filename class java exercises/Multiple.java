import java.util.Scanner;

public class Multiple{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter any number:");
	int number = input.nextInt();

	if(number % 6 == 0 || number % 7 == 0){
	  System.out.print(number + " is a multiple of six or a multiple of seven");
	}
	else{
	   System.out.print(number + " is not a multiple of six or a multiple of seven");
	}

	}
}