package October.ex141024_Operators2;

public class Lab034_Typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
        // short s = phone_no; // Implict - JVM
        short s = (short)phone_no; // Explicit - User - Loss that data
        System.out.println(s);
    }
}
