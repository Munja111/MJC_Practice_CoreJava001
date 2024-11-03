package October.Oct_Tasks;

import java.util.Scanner;

public class Task__Oct22_01 {
    public static void main(String[] args) {

        // Reverse number without using buffer class

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any number that you want to reverse:");

        int number =scanner.nextInt();

        /*
        // Approach -1
        int reverseNumber =0;

        for (;number!=0;)
        {
            int last_digit = number%10;
            reverseNumber = reverseNumber * 10 + last_digit;
            number/=10;
        }
        System.out.println("Reverse number is: "+reverseNumber);
*/
        // Approach -2

        String numberString = Integer.toString(number);  // number --> string >> Wrapper class used here
        String reversedString = "";

        // for loop for reverse number
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversedString += numberString.charAt(i);
        }
        // reverse  string --> integer
        int reversedNumber = Integer.parseInt(reversedString); //Wrapper class
        System.out.println("Reversed Number is: " + reversedNumber);
        scanner.close();
    }
}
