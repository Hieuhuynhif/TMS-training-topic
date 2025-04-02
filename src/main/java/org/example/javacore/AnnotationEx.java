package org.example.javacore;

class Parent {
    public void display() {
        System.out.println("Display method in Parent");
    }
}

class Child extends Parent {
    @Override  // Marks that the method is overriding the parent class method
    @Deprecated  // Marks this method as deprecated
    public void display() {
        System.out.println("Display method in Child");
    }


}

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();  // Single abstract method

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class AnnotationEx {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();  // Output: Display method in Child

        MyFunctionalInterface myFunc = () -> System.out.println("Method implemented using lambda.");
        myFunc.myMethod();
        myFunc.defaultMethod();
    }
}
