package October.ex181024;

import java.util.Scanner;

public class Lab053_switch {
    public static void main(String[] args) {
        // Switch condition
        // User enter 1-7 number and get days name

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day=  scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid  day");
                break;

        }
    scanner.close();
    }
}
