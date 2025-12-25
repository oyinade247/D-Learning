import java.util.Scanner;
public class Meter {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for feet:");	
	double feet = input.nextDouble();

	double convert = feet * 0.0254;

	System.out.printf("%.2f feet is %.3f meters ",feet,convert);
	

	}
}
	
	
	