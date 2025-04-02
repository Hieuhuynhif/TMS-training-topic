package org.example.javacore;


// Generic class
class Box<T> {
    // T stands for "Type"
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        // Creating a Box object that holds an Integer
        Box<Integer> integerBox = new Box<>(10);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Creating a Box object that holds a String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + stringBox.getValue());
    }
}
