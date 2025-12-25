import java.util.Scanner;

public class Program{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter any number: ");
	int numberOne =input.nextInt();

	System.out.print("Enter any number: ");
	int numberTwo = input.nextInt();

	System.out.print("Enter any number: ");
	int numberThree = input.nextInt();

	System.out.print("Enter any number: ");
	int numberFour = input.nextInt();

	int sumOfEven = 0;
	int sumOfOdd = 0;

	if(numberOne % 2 == 0){
      sumOfEven += numberOne;
	 } 
	else{
	sumOfOdd += numberOne;
	}

	if(numberTwo % 2 == 0){
      sumOfEven += numberTwo;
	 } 
	else{
	sumOfOdd += numberOne;
	}

	if(numberThree % 2 == 0){
      sumOfEven += numberThree;
	 } 
	else{
	sumOfOdd += numberThree;
	}
	
	if(numberFour % 2 == 0){
      sumOfEven += numberFour;
	 } 
	else{
	sumOfOdd += numberFour;
	}

	

	  System.out.printf("The sum of the even number is %d%n",sumOfEven);
	  System.out.printf("The sum of the sum of the odd number is %d",sumOfOdd);
   }
}
