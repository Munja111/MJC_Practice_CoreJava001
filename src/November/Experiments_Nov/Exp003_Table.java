package November.Experiments_Nov;

import java.util.Scanner;

public class Exp003_Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number of table you want?");

        int num = scanner.nextInt();
        System.out.println("Here is your requested table for "+num);

       // int n = 11;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dx%d=%d\t\n",num,i, num * i);
        }

        scanner.close();
    }
}
