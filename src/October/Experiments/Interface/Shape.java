package October.Experiments.Interface;

interface Shape {
    void draw();
    void erase();
}

class Circle implements Shape {
    // public class Circle implements Shape - if this class is public then file name should be - Circle.java
    // as of now its Shape.java - interface name , you can give any name as long as class in non-public.
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void erase() {
        System.out.println("Erase a circle");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.erase();
    }
}
