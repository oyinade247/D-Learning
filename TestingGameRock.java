import java.util.Scanner;

public class TestingGameRock{
  public static void  main(String[] args){
     
    Scanner input = new Scanner(System.in);
    
       int choice = 0;

	while(choice < 0 && choice > 2 && choice != 5){
            	 int number = (int)(Math.random()* 3);

		System.out.print("Enter your choice(0 = Rock, 1 = Paper, 2 = Scissors, 5 = Quit): ");
		choice = input.nextInt();
        
	   			  
	if(choice >= 0 && choice <= 2){
	 System.out.printf("Computer chose %d",number);
       

	if(choice == number){ 
      	 	 System.out.print("It is draw");
	}
   	
	else if(choice == 0 && number == 2 || choice == 1 && number == 0 || choice == 2 && number == 1){
      		System.out.print("You win");;
	  }

          else{
		System.out.print("Computer wins");
	  } 
         }else if(choice == 5){
             	System.out.print("Game over");
	  }

         else{
	    System.out.print("Invalid choice");
                choice = 0;
	  }
           

		
      	}
    
   }
}








