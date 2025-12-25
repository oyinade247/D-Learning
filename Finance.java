import java.util.Scanner;
public class Finance {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the subtotal of gratuity:");	
	double subTotal = input.nextDouble();

	System.out.print("Enter the gratuity:");	
	double gratuity = input.nextDouble();
      
	double gratuityRate = subTotal * (gratuity /100);
	double total = gratuityRate + subTotal;

	System.out.print("your gratuity rate is" + gratuityRate);
	System.out.print("your total rate is" + total);
  	}
}