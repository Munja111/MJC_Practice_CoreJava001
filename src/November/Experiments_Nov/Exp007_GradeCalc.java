package November.Experiments_Nov;

import java.util.Scanner;

public class Exp007_GradeCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        char grade ;

        if(score >=90 && score <=100){
            System.out.println("Congrats!! your grade is A");
        } else if (score >=80 && score <=89) {
            System.out.println("your grade is B");
        } else if (score >=70 && score <=79) {
            System.out.println("your grade is C");
        } else if (score >=60 && score <=69) {
            System.out.println("your grade is D");
        } else if (score < 0 || score >100) {
            System.out.println(score+" is not valid score");

        } else {
            System.out.println("your grade is F, Required improvement");
        }

        scanner.close();

    }
}
