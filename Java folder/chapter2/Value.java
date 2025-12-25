import java.util.Scanner;
public class Value{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount:");	
	double amount = input.nextDouble();
	
	System.out.print("Enter annual interest rate in percentage:");	
	double annual = input.nextDouble();

	System.out.print("Enter number of years:");	
	double year = input.nextDouble();


      double futureInvestmentValue = amount * ((1 + annual)*year*12);

	System.out.printf("Accumulated vaue is $%.2f",futureInvestmentValue);
	}
}