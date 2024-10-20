package October.Oct_Tasks;

import java.util.Scanner;

public class Task009_Triangles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side 1");
        double side1= scanner.nextDouble();
        System.out.println("Enter the length of side 2");
        double side2=scanner.nextDouble();
        System.out.println("Enter the length of side 3");
        double side3=scanner.nextDouble();

       /* int side1=15;
        int side2=10;
        int side3=152;*/

        if(side1 <=0 || side2 <=0 || side3 <=0){
            System.out.println("Invalid input: side value should be positive");
        }

        else if(side1==side2 && side2==side3){
            System.out.println("Equal Triangle");
        } else if (side1==side2  || side1==side3 || side2==side3) {
            System.out.println("ISO");
        }
        else {
            System.out.println("Scalene");
        }
        scanner.close();

    }
}
