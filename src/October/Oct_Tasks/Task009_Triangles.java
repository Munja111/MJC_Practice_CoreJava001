package October.Oct_Tasks;

public class Task009_Triangles {
    public static void main(String[] args) {
        int side1=15;
        int side2=10;
        int side3=152;

        if(side1==side2 && side2==side3){
            System.out.println("Equal Triangle");
        } else if (side1==side2  || side1==side3 || side2==side3) {
            System.out.println("ISO");
        }
        else {
            System.out.println("Scalene");
        }

    }
}
