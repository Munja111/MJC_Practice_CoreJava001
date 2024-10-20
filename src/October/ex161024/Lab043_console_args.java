package October.ex161024;

public class Lab043_console_args {
    public static void main(String[] args) {
        // ternary operator > getting value from user
        // using Arguments (in console )

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        System.out.printf("%s,%s,%s\n" ,args[0],args[1],args[2]);

        int age = Integer.parseInt(args[1]);
        System.out.println(age>25 ? "Allowed to Goa":"Not allowed");



    }
}
