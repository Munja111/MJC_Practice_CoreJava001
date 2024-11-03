package October.ex221024_While;

public class Lab078 {
    public static void main(String[] args) {
        String arg_string = args[0];
        // String to Int
        int age = Integer.parseInt(arg_string);
       // System.out.println(age); will print configured argument

        while (age > 0) {
            System.out.println(age);
            age--;
        }
    }
}
