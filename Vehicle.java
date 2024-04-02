class Vehicle {
    public void displayInfo() {
        System.out.println("This is a Vehicle.");
    }
    
    // Method overloading
    public void displayInfo(String message) {
        System.out.println(message);
    }
}

class Car extends Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("This is a Car.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("This is a Motorcycle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        
        // Method overriding
        vehicle.displayInfo(); // Output: This is a Vehicle.
        car.displayInfo();     // Output: This is a Car.
        motorcycle.displayInfo(); // Output: This is a Motorcycle.
        
        // Method overloading
        vehicle.displayInfo("Vehicle information"); // Output: Vehicle information
    }
}
