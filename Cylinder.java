import java.util.Scanner;
public class Cylinder{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the length of a cylinder:");	
	double length = input.nextDouble();

	System.out.print("Enter the radius of a cylinder:");	
	double radius = input.nextDouble();
	
	double area = radius * radius * Math.PI;
	double volumeCylinder =  area * length;
	System.out.print(volumeCylinder);

	}
}
		