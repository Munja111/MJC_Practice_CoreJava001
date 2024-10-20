package October.ex161024;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
       String name= scanner.nextLine();
        System.out.println("Enter your Age: ");
        int age =scanner.nextInt();
        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();

        System.out.println("My name is: "+name);
        System.out.println("I am "+age+" years old");
        System.out.println("Currently i am getting salary like: "+salary+" per month");
        scanner.close();
    }
}
