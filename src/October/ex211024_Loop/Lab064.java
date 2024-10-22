package October.ex211024_Loop;

public class Lab064 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
