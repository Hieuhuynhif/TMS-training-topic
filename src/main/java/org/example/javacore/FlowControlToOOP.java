//import package
package org.example.javacore;

import java.util.Arrays;

public class FlowControlToOOP {
    public static void main(String[] args) {
//        Array of grades
        double[] grades = new double[]{85.5, 90.0, 78.5, 88.0};

        // Creating a Student object
        Student student1 = new Student("John Doe", 20, grades);

        // Calling a method to display student info
        student1.displayStudentInfo();
    }
}

// Student class (OOP Concept)
class Student {
    // Attributes (Variables & Data Types)
    private String name;
    private int age;
    private double[] grades;

    // Constructor (Method)
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    // Method to calculate average grade
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) { // Looping through array
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to determine grade category (Control Flow: if-else)
    public String getGradeCategory() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Grade Category: " + getGradeCategory());
    }
}


