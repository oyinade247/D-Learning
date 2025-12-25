public class Main{
public static void main(String []args){

int number = 6;

	for(int a = 1; a <= number; a++){
	 for(int b = 1; b <= number -a; b++){
	   System.out.print("  ");
	}
	  for(int c =1; c <= a; c++){
	  System.out.print("* ");
	}
	System.out.println();

	}
}
}