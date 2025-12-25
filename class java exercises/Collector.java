import java.util.Scanner;

public class Collector{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter your name:");
	String name1 = input.nextLine();
	System.out.print("Enter your score:");
	int score1 = input.nextInt();

      System.out.print("Enter your name:");
	String name2 = input.next();
	System.out.print("Enter your score:");
	int score2 = input.nextInt();
	
	System.out.print("Enter your name:");
	String name3 = input.next();
	System.out.print("Enter your score:");
	int score3 = input.nextInt();

	int highest = score1;

	if(score2 > highest){
		highest = score2;
	}

	if(score3 > highest){
		highest = score3;
	}
	
	int lowest = score1;

	if(score2 < lowest){
	lowest = score2;
	}

	if(score3 < lowest){
	lowest = score3;
	}

 System.out.println("the highest score is " + highest);
System.out.println("the lowest score is " + lowest);

	}
}