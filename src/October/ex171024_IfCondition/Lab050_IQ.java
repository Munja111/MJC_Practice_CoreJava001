package October.ex171024_IfCondition;

import java.util.Scanner;

public class Lab050_IQ {
    public static void main(String[] args) {
        // Create a program - take user input
        // Check weather the input is even or odd number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number!");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println(num+" is even number!");
        }
        else{
            System.out.println(num+" is odd number!");
        }
        scanner.close();
    }
}
