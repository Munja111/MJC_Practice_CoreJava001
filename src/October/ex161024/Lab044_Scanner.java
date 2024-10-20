package October.ex161024;

import java.util.Scanner;

public class Lab044_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age");

        int age = scanner.nextInt();
        System.out.println(age > 25 ? "Allowed to Goa":"Not allowed");
        scanner.close();


    }
}
