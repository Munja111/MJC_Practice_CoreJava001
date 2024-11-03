package October.Experiments;

public class Exp005 {
    public static void main(String[] args) {
        /*
        int a,b;
        int as=Math.max(a,b);
        System.out.println(as);
        */
        String fun=function_calling();
        System.out.println(fun);
    }
    public static String function_calling(){
        return "hey there";
    }
}
