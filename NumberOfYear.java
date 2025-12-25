import java.util.Scanner;
public class NumberOfYears {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes:");	
	long minutes = input.nextLong();
 
	long minutesInDay = 60 * 24;
	long minutesInYear = minutesInDay * 365;
	long year = minutes / minutesInYear;
	long day = minutes % minutesInYear;
	long daysRemaining = day / minutesInDay; 
	
	 
	System.out.println(daysRemaining);
	System.out.println(year);
  	}
}