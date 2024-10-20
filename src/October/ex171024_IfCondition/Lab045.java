package October.ex171024_IfCondition;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {

     //   int  age =20;  HARDCODED
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }



    }
}
