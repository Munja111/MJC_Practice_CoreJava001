package October.Experiments;

import java.util.Scanner;

public class exp007 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want to print? ");
        
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
