package October.ex151024_0Ternary_Operators;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {


    // HARD CODED
    //    int age=13;
    //    System.out.println(age>18 ? "Allowed to vote":"Not allowed to vote");

        // getting value from the user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age of person");
        int entered_age= sc.nextInt();

        System.out.println(entered_age>18 ? "Allowed to vote":"Not allowed to vote");

        sc.close();

    }
}
