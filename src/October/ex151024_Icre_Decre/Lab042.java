package October.ex151024_Icre_Decre;

public class Lab042 {
    public static void main(String[] args) {

        int z = 10;
        while (z > 0) {
            System.out.println(z--);
        }

        System.out.println();

        int a = 2, b = 5;
        int result = a++ + --b + ++a - b--; // 2 + 4 + 4 - 4
        System.out.println("Result: " + result);
        System.out.println("Final values: a = " + a + ", b = " + b);

        System.out.println();

        int p = 1;
        int q = 2;
        int r = p++ * --q + ++p * q--; // 1 * 1 + 3 * 1
        System.out.println("r: " + r);
        System.out.println("Final values: p = " + p + ", q = " + q);


    }
}
