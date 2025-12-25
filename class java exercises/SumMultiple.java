import java.util.Scanner;

public class SumMultiple{
   public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
     

	System.out.print("Enter a number: ");
         int number = input.nextInt();

	int divisor = 2;
	int sum = 0;

	while(number > 1){
	 
	if(number % divisor == 0){
	number = number / divisor;
	sum = sum + divisor;
	System.out.println(divisor);
	}
        else{
	   divisor++;
	}

	}
	 System.out.printf("The prime factor %d%n",sum);
   }
}

/* 			Get the prime factors of your user input

		prompt your user to enter a number 
	    

