import java.util.Scanner;

public class YoungAndOld{
 public static void main(String[] args){
	Scanner input = new Scanner (System.in);
		
	System.out.print("Enter your name:");
	String name1 = input.nextLine();
	System.out.print("Enter your age:");
	int age1 = input.nextInt();

      System.out.print("Enter your name:");
	String name2 = input.next();
	System.out.print("Enter your age:");
	int age2 = input.nextInt();
	
	System.out.print("Enter your name:");
	String name3 = input.next();
	System.out.print("Enter your age:");
	int age3 = input.nextInt();
	
	int oldest = age1;
	int youngest = age1;

	if(age2 > oldest){
	 oldest = age2;
	   System.out.printf("The oldest person is %s %d", name2 , age2);
	}
	else{
	   youngest = age2;
	    System.out.printf("The youngest person is %s %d",name2, age2);
	}

	if(age3 > oldest){
	 oldest = age3;
	   System.out.printf("The oldest person is %s %d", name3, age3);
	}
	else{
	   youngest = age3;
	    System.out.printf("The oldest person is %s %d", name3, age3);
	}

	}
}