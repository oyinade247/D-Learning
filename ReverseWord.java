public class ReverseWord{
	public static void main(String[] args){
        String letter = "loop";
	String reversed = "";
	
	int count = 0;
	while(count < letter.length()){
	reversed = letter.charAt(count) + reversed;
        count++;
         

	}
         System.out.print(reversed);
	}
}

