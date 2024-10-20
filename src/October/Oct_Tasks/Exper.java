package October.Oct_Tasks;


import java.util.Scanner;

public class Exper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = -1;

        while (score < 0 || score > 100) {
            System.out.println("Enter your score (0-100):");
            score = scanner.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Entered score value is not valid. Please try again.");
            }
        }

        if (score >= 90) {
            System.out.println("Hooorey!! grade is A");
        } else if (score >= 80) {
            System.out.println("grade is B");
        } else if (score >= 70) {
            System.out.println("grade is C");
        } else if (score >= 60) {
            System.out.println("grade is D");
        } else {
            System.out.println("grade is F");
        }

        scanner.close();
    }
}
