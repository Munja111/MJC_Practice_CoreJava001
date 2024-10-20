package October.ex181024;

public class Lab057 {
    public static void main(String[] args) {

        // boolean not allowed
        // float and double also not allowed

        char ch = 'A'; // due to ascii values  this  is allowed

        switch (ch){
            case 65:
                System.out.println("A");
        }




        // for JDK > 13
        int codes =007;

        switch (codes){
            case 011,022,023:
                System.out.println("Falls in Dept1 code");
                break;
            case 003,005,246:
                System.out.println("Falls in Dept2 Code");
                break;
            default:
                System.out.println("None");

        }
    }
}
