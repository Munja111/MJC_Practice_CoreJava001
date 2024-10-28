package October.Experiments;

public class exp004_Break_Continue {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 9, 11};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number found: " + number);
                break; // Exit the loop
            }
        }
        System.out.println("Search complete.");
    }
}
