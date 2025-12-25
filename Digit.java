import java.util.Scanner;

public class Digit{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter five integer: ");
	int number = input.nextInt();
	
	
	String dividedNumber = "";
	int reminder = number % 10;
	dividedNumber = reminder + " " +" "+" "+dividedNumber;
	number = number / 10;
	
	reminder = number % 10;
	dividedNumber = reminder + " " +" "+" "+dividedNumber;
	number = number / 10;

	reminder = number % 10;
	dividedNumber = reminder + " " +" "+" "+dividedNumber;
	number = number / 10;

	reminder = number % 10;
	dividedNumber = reminder + " " +" "+" "+dividedNumber;
	number = number / 10;

	reminder = number % 10;
	dividedNumber = reminder + " " +" "+" "+dividedNumber;
	number = number / 10;
      

  	System.out.print(dividedNumber);
	}
}	