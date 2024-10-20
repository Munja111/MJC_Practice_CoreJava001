package October.ex181024;

public class Lab059 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");  // 10 is output. cause it check value under () at switch [-1]
                break;
            case 9:
                System.out.println("15");
                break;
    }
    }
}
