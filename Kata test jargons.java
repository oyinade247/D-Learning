public class Kata{

	public static int getFactorOf(int number){
	
	int numberOfCount = 0;
	int count = 1;

	while(count < number){
	 
		if(number % count == 0){
		   numberOfCount++;
	 	 }
		count++;
		
	}
	
		return numberOfCount;

}


	public static boolean isPrime(int number){
		int count = 2;
		
		while(count < number) {
	
		if(number % count == 0){
			return false;
		}
		count++;
		}
				
		return true;
	}

	public static boolean isOdd(int number){
	  if(number % 2 == 1){
		return true;
		}
	     return false;
	}


	public static boolean isLeapYear(int number){
	  if(number % 4 == 0 && number % 100 != 0 || number % 4 == 0 && number % 400 == 0) {
		return true;
		}
	     return false;
	}

	public static double getCelsius(double farenhenit){
		double substraction = 5 * (farenhenit - 32);
		double dividedNumber = substraction / 9;

		return dividedNumber;
	}

	public static void printAsterik(int row){
	for(int count = 1 ;count <= row; count++){
		for(int counter = 1 ;counter <= -row; counter++){
		
		   System.out.print("*");
		}
		 System.out.println(" ");

	}
	
	}







}