import java.util.Scanner;

public class CompoundValue{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter the monthly saving account :"); 
	double money = input.nextLong();

	double monthlyInterest = 0.05 / 12;
	double oneMonth = money * (1 + monthlyInterest);
	double sixMonth = oneMonth * 6;
	System.out.print(sixMonth);
	}
}