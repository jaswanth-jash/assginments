package training;

public class Vehicle1 {
    void run() {
        System.out.println("Vehicle is moving");
    }
}

//Creating a child class
class Car extends Vehicle1 {
    void run() {
        System.out.println("Car is running");
    }

    public static void main(String args[]) {
        //creating an instance of child class
        Vehicle1 obj1 = new Vehicle1();
        Car obj = new Car();
        //calling the method with child class instance
        obj1.run();
        obj.run();
    }
}

