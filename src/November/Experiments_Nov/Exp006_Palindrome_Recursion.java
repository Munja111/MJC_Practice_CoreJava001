package November.Experiments_Nov;

import java.util.Scanner;

public class Exp006_Palindrome_Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String str = scanner.nextLine();

       str = str.replaceAll("\\s+", "").toLowerCase();

        scanner.close();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static boolean isPalindrome(String str, int start, int end) {
       if (start >= end) return true;  // for blank string or single character

        if (str.charAt(start) != str.charAt(end)) return false;

        return isPalindrome(str, start + 1, end - 1);
    }

}
