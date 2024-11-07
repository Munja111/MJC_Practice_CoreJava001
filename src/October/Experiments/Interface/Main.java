package October.Experiments.Interface;

public class Main {
    // Define the Vehicle interface
    interface Vehicle {
        void start();  // Method to start the vehicle
        void stop();   // Method to stop the vehicle
    }

    // Implementing the Vehicle interface in the Car class
    static class Car implements Vehicle {

        // Implementing the start method
        @Override
        public void start() {
            System.out.println("The car is starting.");
        }

        // Implementing the stop method
        @Override
        public void stop() {
            System.out.println("The car is stopping.");
        }
    }

    public static void main(String[] args) {
        // Creating an object of Car class
        Vehicle myCar = new Car();

        // Calling methods defined in the Vehicle interface
        myCar.start();  // Output: The car is starting.
        myCar.stop();   // Output: The car is stopping.
    }
}
