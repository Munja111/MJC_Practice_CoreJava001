package October.ex211024_Loop;

public class Lab076 {
    public  static void main(String[] args){
        for (int i = 1; i <= 25; i++) {
            if (i % 2 == 0) {
             //   System.out.println("Even number is -> " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
