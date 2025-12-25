import java.util.Scanner;
	public class CelsiusToFahrenheit{
	public static void main(String[] args){
	
	Scanner collect = new Scanner(System.in);

	
	System.out.print("Enter a degree in celsius");
	double celsius = collect.nextDouble();

	double fahrenheit = (9.0 / 5) * celsius + 32;

	System.out.print(fahrenheit);
	}
}