package October.ex211024_Loop;

public class Lab071 {
    public static void main(String[] args) {
        int i = 10;
        for (; i > 0; i--) {
            if (i==2) break;
            if (i==5) continue;
            System.out.println(i);

        }
    }
}
