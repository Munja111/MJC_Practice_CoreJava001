package October.ex221024_While;

public class Lab081 {
    public static void main(String[] args) {
         /*
               int a = 0;
        while (a < 0)
        {
            System.out.println("Hello there!, this is While loop!");
            a++;
        }
*/
        int a = 0;
        do {
            System.out.println("Do While loop -value: " +a);
            a++;
        }
        while (a < 0);
    }
}
