package org.example.javacore;


interface Animal {
    // Abstract method (no body)
    void sound();

}

class Dog implements Animal {
    // Implementing the abstract method from Animal interface
    public void sound() {
        System.out.println("Woof!");
    }
}


public class InterfaceEx {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Outputs: Woof!
    }
}
