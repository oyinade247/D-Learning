import java.util.Scanner;
public class SumDigitss{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number : ");
	int number = input.nextInt();

	  	int remainder = 0;

	 while(number > 0){
	
	int dividedNumber = number % 10;
	remainder += dividedNumber;
	 number /= 10;
	  System.out.println("remainder" + remainder);
        }
	 System.out.print(remainder);

         	}
}
