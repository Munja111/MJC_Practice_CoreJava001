package October.ex181024;

import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any char. from the keyboard: ");
        String ch=scanner.next();
        ch=ch.toLowerCase();

        switch (ch){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch+" is vowel char.");
                break;
            default:
                System.out.println(ch+ " is not vowel char.");
                break;

        }
    }
}
