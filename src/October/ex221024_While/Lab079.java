package October.ex221024_While;

public class Lab079 {
    public static void main(String[] args) {

        int i = 0;
        while (i > 0) {
            System.out.println("Enter inside the loop");
            System.out.println(i);
            i++;
        }


        /*
        while (false){ // Loop condition is always false making the loop body unreachable
            System.out.println("Abc");
        }
        System.out.println("Print for false");
    }
     */
        /*
        while (true) {
            System.out.println("Inside");
        }
        System.out.println("Outside the loop");  // error will display, loop body unreachable

    }
    */
        /*
    while (true) {
        System.out.println("Inside the loop"); // infinite as condition is true
    }
    */
    }
}

