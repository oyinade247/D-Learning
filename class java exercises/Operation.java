import java.util.Scanner;
public class OPeration {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");	
	int numberOne = input.nextInt();

	System.out.print("Enter a character:");	
	String arithmetric = input.next();
		
	System.out.print("Enter a number:");	
	int numberTwo = input.nextInt();

	String plus = "+";
	String minus = "-";
	String product = "*";
	String divide = "/";

	if(arithmetric.equals(plus)){
		System.out.print(numberOne + numberTwo);
	}

	if(arithmetric.equals(minus)){
		System.out.print(numberOne - numberTwo);
	}

	if(arithmetric.equals(product)){
		System.out.print(numberOne * numberTwo);
	}

	if(arithmetric.equals(divide)){
		System.out.print(numberOne / numberTwo);
	}
	//System.out.printf("result %d %s %d", numberOne, arithmetric, numberTwo);
	}
}