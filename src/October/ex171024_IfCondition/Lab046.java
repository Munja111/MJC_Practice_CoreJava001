package October.ex171024_IfCondition;

import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("Not Allowed");
        }
        scanner.close();
    }
}
