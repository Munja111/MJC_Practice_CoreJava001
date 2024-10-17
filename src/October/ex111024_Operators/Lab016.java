package October.ex111024_Operators;

public class Lab016 {
    public static void main(String[] args) {
        // < (Less than)
        //<= (Less than or equal to)
        //> (Greater than)
        //>= (Greater than or equal to)
        //== (Equal to)
        //!= (Not equal to)

        //  //  > < , >= <= , != , ! -> true or false

        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);
        System.out.println(!c);

        int age_mamitha = 34;
        int age_pramod = 34;
        boolean result = age_pramod >= age_mamitha;
        boolean result1 = age_pramod > age_mamitha;

        // age_pramod > age_mamitha or age_pramod =age_mamitha
        System.out.println(result);
        System.out.println(result1);

    }
}
