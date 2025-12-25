import java.util.Scanner;
public class Multiply{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number : ");
	int number = input.nextInt();

	int count = 1;
	int multiple = 0;
	
	while(count <= 12){
	 multiple = number * count;
	 System.out.println(number + " " + "*" + " "+"count" + " " + "=" + multiple );
	
	}

	}
}