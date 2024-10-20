package October.ex171024_IfCondition;

import java.util.Scanner;

public class Lab052_HackerrankQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        char grade ='F';
        
        if(score >=90 && score <=100){
            System.out.println("Hooorey!! grade is A");
        } else if (score >=80 && score <=89) {
            System.out.println("grade is B");
        } else if (score >=70 && score <=79) {
            System.out.println("grade is C");
        } else if (score >=60 && score <=69) {
            System.out.println("grade is D");
        } else if (score <=0 || score >100) {
            System.out.println("Entered score value is not valid");

        } else {
            System.out.println("grade is F");
        }

        scanner.close();
    }
}
