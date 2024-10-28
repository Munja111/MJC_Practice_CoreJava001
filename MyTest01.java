//package First;
import java.util.Scanner;

public class MyTest01{
    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number 1:");
	int number1 = scanner.nextInt();

	System.out.println("Enter the number 2:");
	int number2 = scanner.nextInt();

	
       // System.out.println(number1+number2+ " is sum of both numbers");

       // System.out.println("Sum of both numbers is->:"+number1+number2);

	int result_mult = mul_of_numbers(number1,number2);
	System.out.println("Multiplication of numbers is-> :"+result_mult);

	int result_div = div_of_numbers(number1,number2);
	System.out.println("Division of numbers is-> :"+result_div);

	scanner.close();
    }

	static int mul_of_numbers(int number1, int number2){
	return number1*number2;
}
	static int div_of_numbers(int number1, int number2){
	return number1/number2;
}
    
}