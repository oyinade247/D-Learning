import java.util.Scanner;
public class SingleDigits{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number from 0-9: ");	
	int digit = input.nextInt();

	switch(digit){
	 case 0 :
		System.out.println("You've enter number Zero");break;
	
	case 1 :
		System.out.println("You've enter number One");break;

	case 2 :
		System.out.println("You've enter number Two");break;

	case 3 :
		System.out.println("You've enter number Three");break;

	case 4 :
		System.out.println("You've enter number Four");break;

	case 5 :
		System.out.println("You've enter number Five");break;

	case 6 :
		System.out.println("You've enter number Six");break;

	case 7 :
		System.out.println("You've enter number Seven");break;

	case 8 :
		System.out.println("You've enter number eight");break;

	case 9 :
		System.out.println("You've enter number Nine");break;

	default: 
		System.out.println("Enter digit from 0-9");break;

	}

	}
}