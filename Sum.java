public class Sum{

public static int large(int i1, int i2){


	int result;

	if(i1 > i2){
	 result = i1;
	}

	else{
	result = i2;
	}
	return result;

}


public static void main(String [] args){

int number1 = 18;

int number2 = 10;

int number3 = large(number1, number2);

System.out.print(number3);


}
}

