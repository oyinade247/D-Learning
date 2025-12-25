import java.util.Scanner;
public class PrintTen{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	 System.out.print("Enter four digits: ");
	 int number = input.nextInt();

	    String reversedNumber = "";
	    
	   while(number > 0 ){
	    int remainder = number % 10;
	    reversedNumber += remainder;
             number /= 10;
	    
	  }
	   System.out.print(reversedNumber);
	}
}