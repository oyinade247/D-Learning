import java.util.Scanner;
public class AreaOfHexagon{
	public static void main(String[] args){
	 int number1 = (int)(Math.random()*10);
	 int number2 = (int)(Math.random()*10);
	
	  Scanner collect = new Scanner(System.in);
	  System.out.printf("What is %d %s %d %s",number1,"+",number2, "=");
	  int answer = collect.nextInt();

	  while(number1 + number2 != answer ){
	   System.out.println("Your answer is incorrect,enter the correct answer my friend!");
	   System.out.printf("What is %d %s %d %s",number1,"+",number2, "=");
	    answer = collect.nextInt();
	  }

	  System.out.print("You are right scholar!");	
	}
}
			
