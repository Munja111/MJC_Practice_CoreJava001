package October.Experiments;

public class Exper_Functions01 {
        public static void main(String[] args) {
            // does not return anything and takes no parameters
            saySomethingPlease();

            // does not return anything but takes a parameter
            sayHelloToYou("AI Engineer");

            // returns an integer and takes parameters
            int result = sumOfTwoGood(3, 4);

            // Print the result returned by sumOfTwoGood
            System.out.println(result);

            // Call the method that does not return anything and takes parameters
            sumOfTwoBad(3, 4);
        }

        // Method that does not return anything and takes no parameters
        static void saySomethingPlease() {
            System.out.println("Non-return method with no parameters.");
        }

        // Method that does not return anything and takes a String parameter
        static void sayHelloToYou(String job) {
            System.out.println("Hello, " + job);
        }

        // Method that returns the sum of two integers and takes parameters
        static int sumOfTwoGood(int a, int b) {
            return a + b;
        }

        // Method that does not return anything and prints the sum of two integers
        static void sumOfTwoBad(int a, int b) {
            System.out.println("Sum of two numbers: " + (a + b));
        }
    }


