package First;
import java.util.Scanner;

public class MyTest02{
    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number 1:");
	int number1 = scanner.nextInt();

	System.out.println("Enter the number 2:");
	int number2 = scanner.nextInt();

	
       System.out.println(number1+number2+ " is sum of both numbers");

      	scanner.close();
    }
    
}