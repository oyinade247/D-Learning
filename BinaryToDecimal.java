import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any number(containing only 1 and 0): ");
		int number = input.nextInt();

		int sum = 0;
		int power = 1;
		
		while (number > 0) {
			int remainder = number % 10;
			sum += remainder * power;
			power = power * 2;
			number /= 10;
		}

		System.out.println(sum);
	}
}