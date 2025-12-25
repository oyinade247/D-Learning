import java.util.Scanner;

public class Binary {
	public static void main(String[] args){
		var input = new Scanner(System.in);

		System.out.print("enter a number to convert to binary: ");
		int digit = input.nextInt();

		String binary = "";

		while (digit > 0) {
			int remainder = digit % 2;
			binary = remainder + binary;
			digit = digit / 2;
		}

		System.out.println(binary);
	}
}