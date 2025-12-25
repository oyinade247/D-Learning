import java.util.Scanner; 
	public class LeapYear{
 	 public static void main(String[] args){

	int numberOne = (int)(Math.random() * 10);
	int numberTwo = (int)(Math.random() * 10);

	Scanner collect = new Scanner(System.in);
	
	System.out.print("what is " + numberOne + " + " + numberTwo + " = " );
	int answer = collect.nextInt();

	while(numberOne + numberTwo != answer){
		System.out.print("you are wrong" + "what is " + numberOne + "+" + numberTwo + "?");
		answer = collect.nextInt();
	}
		
	System.out.print("you are right");

	
	

	
}

}	
		