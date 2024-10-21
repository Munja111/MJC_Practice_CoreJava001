package October.Oct_Tasks;

import java.util.Scanner;

public class Task__18Oct_01 {
    public static void main(String[] args) {
/*
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number 1 here:");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2 here:");
        int num2 = scanner.nextInt();

*/

        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input: Second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input: Operator
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation based on the operator using switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        // Close the scanner
        scanner.close();





    }
}
