import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first length: ");	
	int lengthOne = input.nextInt();

	System.out.print("Enter the second length: ");	
	int lengthTwo = input.nextInt();
	
	System.out.print("Enter the third length: ");	
	int lengthThree = input.nextInt();

	if(lengthOne == lengthTwo && lengthOne == lengthThree){
	 System.out.print("They are equilateral");
	}

	/*else if(lengthOne != lengthTwo && lengthOne != lengthThree ){
	 System.out.print("They are scalene");
	}*/

	else if(lengthOne == lengthTwo || lengthOne == lengthThree || lengthThree == lengthTwo){	
	System.out.print("They are isoceles");
	}

	else{
	 System.out.print("They are scalene");
	}

	}
}
