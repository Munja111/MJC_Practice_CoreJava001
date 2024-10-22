package October.Experiments;

public class exp003 {
    public static void main(String[] args) {

            int number = 879465;  // Input number
            String numberString = Integer.toString(number);  // Convert number to string
            String reversedString = "";  // Initialize reversed string

            // Loop to build the reversed string
            for (int i = numberString.length() - 1; i >= 0; i--) {
               reversedString += numberString.charAt(i);  // Append characters in reverse order
            }

            // Convert reversed string back to integer
            int reversedNumber = Integer.parseInt(reversedString);

            System.out.println("Reversed Number: " + reversedNumber);
    }

}
