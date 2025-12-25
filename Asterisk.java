import java.util.Scanner;  
public class Asterisk{
     public static void main(String[] args){
	
	/*for(int count = 0; count < 6; count ++){
	       System.out.println("");

	 	 for(int counter = 0; counter <= count; counter++){
	  System.out.print("*");
	}
      
      }*/
	

    Scanner input = new Scanner(System.in);
	
   System.out.print("Enter a number");
     int number = input.nextInt();

	//for(int a = 6; a >= 0; a--){
	 //System.out.println("");
	
	//for(int counter = 0; counter < a ; counter++ ){
	// System.out.print("*");
	//}

	//}

	for(int a = 1; a <= number; a--){
	 for(int b = 1; b < a -1; b++){
	   System.out.print("");
	}
	  for(int c = 1; c <= a; a++){
	  System.out.print("*");
	}
	System.out.print();

	}
	
   }
}
         
