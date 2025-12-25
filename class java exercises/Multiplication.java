
 /* 			 Multipication
  	create a Scanner object

  	   prompt your user to enter a number

  	     create a variable to read the user input 

   	       initialize your count variable to 0 and also initialize another variable to store the output
		
		while count is less than 12
		
		increment count 

		
		multiply count and number and assign it to multiple variable
             
		display the user input * the count and assign it to mutiple.

		
*/
import java.util.Scanner;

public class Multiplication{
   public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
     

	System.out.print("Enter a number: ");
         int number = input.nextInt();

	int count = 0;

	int multiple = 0;

	while(count < 12){
	count++; 
	multiple = number * count;
         System.out.printf("%d %s %d %s %d %n",number,"*",count,"=",multiple);
	}
	 

	}
}