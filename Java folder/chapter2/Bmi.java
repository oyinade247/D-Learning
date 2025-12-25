import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds:");	
	double weight = input.nextDouble();
	
	System.out.print("Enter height in inches:");	
	double height = input.nextDouble();

	double weightKilo = weight * 0.45359237;
	double heightMeter = height * 0.0254; 

      double bodyMass = weightKilo / (heightMeter * heightMeter);

	System.out.printf("The BMI is %.4f", bodyMass);
	}
}