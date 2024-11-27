package November.Experiments_Nov;

public class Exp001 {
    public static void main(String[] args) {
    Car car = new Car();
    }
}

class Car extends Vehicle {
    private int maxSpeed =250;

    @Override
    void display() {
        //super.display();
        System.out.println("Child method");
    }

    Car(){
       // super(158);
        super();
    //    System.out.println(maxSpeed);
     //   System.out.println(this.maxSpeed);
     //   System.out.println(super.maxSpeed);
        System.out.println("DC of car called");

        this.display();
        super.display();
    }

}

class Vehicle {
    protected int maxSpeed =180;

    void display(){
        System.out.println("Parent method");
    }

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC of Vehicle called");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }
}