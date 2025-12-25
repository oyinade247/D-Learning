import java.util.Scanner;

public class SumCube{
   public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);

	System.out.print("Enter any number: ");
	 int number = input.nextInt();

          int store = number;
 	   int multiply = 0;
           int sum = 0;
            int dividedNumber = 0;

	while(number > 0){
         	int count  = 1;
         	int remainder = number % 10;
          
	   while(count <= 1 ){
        		multiply = remainder * remainder * remainder;
			sum = sum + multiply;
          		 count++;
	   }
              number = number / 10;
              
          }

	 if(store == sum){
           System.out.println("it is a strong number");
	 }

	else{
	   System.out.println("it is not strong number");
	}
	
                     
	 System.out.println("The sum of the cube is "+sum);

	
	}
}