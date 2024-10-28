package October.Oct_Tasks;

import java.util.Scanner;

public class Task__Oct23_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        int result_sum= sum_of_numbers(a,b);
        System.out.println("Sum is ->" +result_sum);

        int result_sub= sub_of_numbers(a,b);
        System.out.println("Subtraction is ->" +result_sub);

        int result_mul = mul_of_numbers(a,b);
        System.out.println("Multiplication is ->"+result_mul);

        int result_div = div_of_numbers(a,b);
        System.out.println("Division is ->"+result_div);

        int result_mod = modulus_of_numbers(a,b);
        System.out.println("modulus is ->"+result_mod);


        scanner.close();

    }

    private static int modulus_of_numbers(int a, int b) {
        return a%b;
    }

    private static int div_of_numbers(int a, int b) {
        return a/b;
    }

    private static int mul_of_numbers(int a, int b) {
        return  a*b;
    }


    static int sub_of_numbers(int a, int b) {
        return a-b;
    }

    static int sum_of_numbers(int a, int b){
        return a+b;
    }

}
