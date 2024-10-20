package October.ex171024_IfCondition;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        // if elseif elseif else

        // HARDCODED
      //  int num1 =52;
     //   int num2=52;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();

        if(num1 >num2){
            System.out.println("Number 1 is greater than Number 2");
        }
        else if (num2> num1) {
            System.out.println("Number 2 is greater than Number 1");
        }
        else {
            System.out.println("Both are equal!");
        }
        scanner.close();
    }
}
