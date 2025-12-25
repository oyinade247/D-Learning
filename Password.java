import java.util.Scanner;
public class Password{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your password : ");
	String password = input.nextLine();
	String confirmPassword = "";

        

	do {

	    System.out.print("Enter your password for confirmation: ");
	    confirmPassword = input.nextLine();

	} while (!confirmPassword.equals(password));
	 

	System.out.println("password saved sucessfully");
	}
}