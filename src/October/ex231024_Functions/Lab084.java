package October.ex231024_Functions;

import java.util.Arrays;

public class Lab084 {
    public  static void main(String[] args) {
       NewClass ne = new NewClass();
       ne.sumBoth();
    }
     static class NewClass{
        int a=10;
        int b=20;

        static {
            System.out.println("Hey this is static blcok");
        }
        void sumBoth(){
            System.out.println(a+b+" is Sum of both numbers");
            System.out.printf("Sum of both numbers is %d" ,a+b);
        }
    }
}
