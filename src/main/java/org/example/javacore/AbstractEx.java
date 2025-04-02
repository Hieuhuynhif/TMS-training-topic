package org.example.javacore;


abstract class Vehicle {
    // Abstract method (no implementation)
    public abstract void start();

    // Concrete method (with implementation)
    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicle {
    // Implementing the abstract method from Vehicle class
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Outputs: The car is starting.
        myCar.stop();  // Outputs: The vehicle is stopping.
    }
}


