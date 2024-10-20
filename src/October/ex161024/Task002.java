package October.ex161024;

public class Task002 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Maximum num is: "+(num1>num2 ? num1:num2));

    }
}
