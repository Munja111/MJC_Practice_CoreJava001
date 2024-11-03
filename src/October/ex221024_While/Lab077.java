package October.ex221024_While;

public class Lab077 {
    public static void main(String[] args) {
        int a =1;
        while (a<=10){
            System.out.println("Hello!!");
            a++;
        }


        float M=3.14f;
        M=3.01f;
        M=10.25f;
        System.out.println(M); // 10.25 as M value is not final


       final float pi=3.14f; // as pi value assigned as final
     //   pi=3.01f; // cannot assign a value to final variable pi
     //   pi=10.25f;
        System.out.println(pi);
    }
}
