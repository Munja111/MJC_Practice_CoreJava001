package October.Experiments;

public class exp003 {
    public static void main(String[] args) {

            int number = 879465;
            String numberString = Integer.toString(number);
            String reversedString = "";

            for (int i = numberString.length() - 1; i >= 0; i--) {
               reversedString += numberString.charAt(i);
            }

            int reversedNumber = Integer.parseInt(reversedString);

            System.out.println("Reversed Number: " + reversedNumber);
    }

}
