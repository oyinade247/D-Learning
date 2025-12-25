import java.util.Scanner;
public class Changing{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");	
	int firstNumber = input.nextInt();

	System.out.print("Enter a number: ");	
	int secondNumber = input.nextInt();

	
	/*2+5=7
	7-5=2
	7-2=5*/
	
	secondNumber = secondNumber + firstNumber;
	firstNumber = secondNumber -firstNumber;
	secondNumber = secondNumber - firstNumber;
	System.out.printf("The first number is %d%n",firstNumber);

	System.out.printf("The second number is %d%n",secondNumber);


	} 
}