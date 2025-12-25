import java.util.Scanner;

public class HigherNumbers{
   public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	 int number = (int)(Math.random()*10);

	System.out.print("Enter any Number : ");
        int guess = input.nextInt();

        
        while(number != guess){
	 System.out.print("Guess again: ");
           number = input.nextInt();

           
	}
        System.out.print("good job");


	} 
}