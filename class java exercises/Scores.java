import java.util.Scanner; 
public class Scores{
	public static void main(String [] args){
	
	Scanner collector = new Scanner(System.in);

	 int [] scores = new int [5] ;
	int i;
	for(i = 0; i < scores.length; i++){
 
	System.out.print("Enter a number:");
	int studentScore = collector.nextInt();
		
	 scores[i] = studentScore;
	 
   	}

	for(int counter = 0; counter < 5; counter++){
		System.out.print(scores[counter]);
	}


}
}