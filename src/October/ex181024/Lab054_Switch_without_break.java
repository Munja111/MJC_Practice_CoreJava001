package October.ex181024;

import java.util.Scanner;

public class Lab054_Switch_without_break {
    public static void main(String[] args) {


        // Switch condition
        // User enter 1-7 number and get days name

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day=  scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Enter valid  day");


        }
        scanner.close();
    }
}