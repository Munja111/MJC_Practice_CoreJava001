package October.Experiments;

import java.util.Scanner;


public class Exp002_for_vs_while {

    //For Loop Example
    //Typically used when you know the number of iterations in advance.
    public static void main(String[] args) {
        String[] items = {"Apple", "Date", "Cherry", "Banana", "Watermelon", "Orange", "Mango"};

        for (int i = 0; i < items.length; i++) {
            System.out.println("Fruits : " + items[i]);
        }
        // for spacing
        System.out.println();

        // While Loop Example
        //Best used when the number of iterations is not known beforehand and depends on a condition being met.

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Type 'cherry' to quit:");
        input = scanner.nextLine();

        while (!input.equalsIgnoreCase("cherry")) {
            System.out.println("You typed: " + input + " Type 'cherry' to quit:");
            input = scanner.nextLine();
        }
        System.out.println("Program terminated.");
        scanner.close();

    }
}
