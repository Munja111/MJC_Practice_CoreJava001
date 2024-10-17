package October.ex141024_Operators2;

public class Lab033_Typecasting {
    public static void main(String[] args) {
        // Type Casting -
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening -Converting - small data type to large
        byte b = 10;
        int a = b; // Valid -> Implicit Casting - JVM
        int a1 = (int)b; // Valid -> Explicit Casting - JVM
        System.out.println(a1);

        // Narrowing - Converting - Large data type - small
        int val = 200;
        //byte b2 = val; // Invalid - Implicit - JVM
        byte b2 = (byte)val; // valid - Explicit - JVM

        byte b3 = (byte)val; // Valid -> Explicit - User
        System.out.println(b3);

    }
}
