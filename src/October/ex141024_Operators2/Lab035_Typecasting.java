package October.ex141024_Operators2;

public class Lab035_Typecasting {
    public static void main(String[] args) {

        // GST - 18.45
        int course = 100;
        float GST = 18.45f;
        int total_price = course+(int)GST; // Narrowing -> Explicit
        System.out.println(total_price);
    }
}
