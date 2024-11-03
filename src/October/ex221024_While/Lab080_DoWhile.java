package October.ex221024_While;

public class Lab080_DoWhile {
    public static void main(String[] args) {
        int a = 10;
        do {
            System.out.println("Value of a -> " + a);
            a--;
        } while (a > 0);

        System.out.println("================");

        int b = 1;
        do {
            System.out.println("Value of b -> " + b);
            b++;
        } while (b <=10);
    }
}
