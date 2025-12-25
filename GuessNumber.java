import java.util.Scanner;
public class GuessNumber{
	public static void main(String[] args){
	 int number = (int)(Math.random()*100);
	 	
	 Scanner input = new Scanner(System.in);

	 System.out.println("Enter any number from 0 - 100 ");
	 int guess = 2;
	
	while(guess != number){

	System.out.print("enter your guess: ");
	  guess = input.nextInt();

	if(guess == number){
	 System.out.printf("you are right dude! the correct guess is %d %n",number);
	}
	 else if(guess > number){
	  System.out.println("your guess is too high! my Nigga!");
	}

	else if(guess < number){
	  System.out.println("your guess is too low! my Nigga!");
	}
	
	else{
	  System.out.println("invalid!");

	 
	}
  

      }  

	}
}