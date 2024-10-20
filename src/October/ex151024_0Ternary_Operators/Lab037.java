package October.ex151024_0Ternary_Operators;

public class Lab037 {
    public static void main(String[] args) {
             int a =10, b=200, c=300, min,max,max_among_two,
                m =172, n=131, o=152, num;

             // (condition) : exp1 : exp2
        // (x>=y) ? x:y
             max_among_two=(a>b) ? a:b;
        System.out.println(max_among_two);

        // below logics are bit complex
        min=(a<=b) ? (a<=c ? a:c):(b<=c ? b:c);
        System.out.println("this is minimum value: "+min);

        max=(a>=b) ? (a>=c ? a:c):(b>=c ? b:c);
        System.out.println("this is maximum value: "+max);

        num=(m<=n) ? (m<=o ? m:o):(n<=o ? n:o);
        System.out.println("this is minimum num: "+num);

        System.out.println();


        // Easy and proper
        int x=104, y=159, z=-890;

        int largest = (x>=y && x>=z) ? x :(y>=z ? y:z);
        System.out.println(largest);
    }
}
