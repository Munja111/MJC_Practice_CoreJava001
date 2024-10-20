package October.ex151024_0Ternary_Operators;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        // nested ternary operator

        //HARDCODED
      //  int score =79;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your score here");
        int score=scanner.nextInt();

        String grade = (score>=90) ? "A" :(score>=80) ? "B" :(score>=70) ? "C" :(score>=60) ? "D" : "F";
        System.out.println("Your grade is "+grade);

        System.out.printf("Your grade is %s",grade); //printf



    }
}
