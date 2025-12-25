import java.util.Scanner;
public class SubstractionGuess{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	 int numberOfQuestions = 5;
	 int count = 0;
	 int countCorrectAnswer = 0;
	 int wrongAnswer = 0;
	 
	long startTime = System.currentTimeMillis();

	 while(count < numberOfQuestions){
	  int number1 = (int)(Math.random()*10);
	  int number2 = (int)(Math.random()*10);
	   count++;


	  int temp = number1;
	   number1 = number2;
	    number2 = temp;
 	 
	 System.out.printf("What is %d %s %d %s",number1, " - " , number2 , "=");

	 int answer = input.nextInt();
		
	 if(number1 - number2 == answer){
	  System.out.println("You are right dude! ");
	   countCorrectAnswer++;
	 }
	else{
          System.out.printf("You are wrong dude! %nThe correct answer should be %d %s %d %s %d%n", number1, "-", number2, "=",(number1 - number2));
	   wrongAnswer++;    
	}
	 

	 }
	  System.out.printf("The total number of your score is %d%s%d%n ", countCorrectAnswer, "/", numberOfQuestions);	
	 

	}
}