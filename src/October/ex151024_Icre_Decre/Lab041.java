package October.ex151024_Icre_Decre;

public class Lab041 {
    public static void main(String[] args) {
        int y = 3;
        int sum = y++ + y++ + y++; //3 + 4 + 5
        System.out.println("Sum: " + sum); //
        System.out.println("Final value of y: " + y); //6

        System.out.println();

        int a =20;
        System.out.println(--a + a++ + a--); // 19 + 19 + 20
        System.out.println(a); // 19
    }
}
