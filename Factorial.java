import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number");
	int number = input.nextInt();

	int store = number;
	int sum = 0;

	while(number > 0){
	int factorial = 1;
	int count = 1;
	int remainder = number % 10;
	
	     while(count <= remainder){
	         factorial += (remainder - count) * factorial;
	         count++;
	     
		}
	     sum += factorial;
             number = number / 10;
	}
              
		System.out.println(sum);

           if(sum == store){
	    System.out.print("It is a strong number");
	   }
		
           else{
             System.out.print("it is not a strong number");
	   }

	}
}