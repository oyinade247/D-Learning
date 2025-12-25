import java.util.Scanner;

public class CurrentTime{
	public static void main(String[] args){
	
	long milliseconds = System.currentTimeMillis();
	
	long totalSecond = milliseconds / 1000;

	long currentSeconds = totalSecond % 60 ;
	
	long totalMinutes = totalSecond / 60;

	long currentMinutes = totalSecond % 60;
	
	long totalHours =  totalMinutes / 60;

	long currentHours = totalHours % 24;


	System.out.printf("The current time is %d  %d %d", currentHours, currentMinutes, currentSeconds);
	}
}