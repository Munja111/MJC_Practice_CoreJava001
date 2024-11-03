package October.ex211024_Loop;

public class Lab075 {
    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            if (i == 9) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("---------------------");
        for (int j = 0; j < 15; j++) {
            if (j == 10) {
                continue;
            }
            System.out.println(j);
        }
    }
}
