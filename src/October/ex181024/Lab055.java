package October.ex181024;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {
        // switch case statement in Web automation

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your browser");

        String browser = scanner.nextLine();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Chrome browser is opened");
                break;
            case "firefox":
                System.out.println("Firefox browser in opened");
                break;
            case "edge":
                System.out.println("Edge browser in opened");
                break;
            default:
                System.out.println("Enter valid browser");
                break;

        }

    }
}
