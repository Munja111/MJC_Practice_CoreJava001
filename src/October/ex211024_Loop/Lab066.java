package October.ex211024_Loop;

public class Lab066 {
    public static void main(String[] args) {
        for (int i = 0; i > 1 ; i++) { // condition not fulfill thus exit from the loop
            System.out.println(i);
        }
        System.out.println("End");


        for (int i = 0; ; i++) {  // we can run without condition -> it will run infinite time
            System.out.println(i); // after stopped - Process finished with exit code 130

        }


    }
}
