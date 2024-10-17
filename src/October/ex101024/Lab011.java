package October.ex101024;

public class Lab011 {



    public static void main(String[] args) {
       // Without final
        float pi =3.14f;
        pi=15.8f;
        System.out.println(pi);

        // With  final
        // final can be method, class and variable
        final float p =3.14f;
        // p=15.8f;   >> java: cannot assign a value to final variable p
        System.out.println(pi);

    }

}
