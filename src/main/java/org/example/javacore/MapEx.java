package org.example.javacore;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<Integer, String> studentGrades = new HashMap<>();

        // Add elements to the Map (key-value pairs)
        studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A");
        studentGrades.put(104, "C");

        studentGrades.put(102, "A+"); // Update grade for student ID 102
        studentGrades.remove(103); // Remove the entry with student ID 103

        // Accessing a value by key
        System.out.println(studentGrades.get(102));
        // Check if a key or value exists in the Map
        boolean hasStudent101 = studentGrades.containsKey(101);
        boolean hasGradeA = studentGrades.containsValue("A");

        System.out.println("Map after adding elements:");
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " - Grade: " + entry.getValue());
        }

        // Get the size of the Map
        System.out.println("\nSize " + studentGrades.size());

        // Clear all elements in the Map
        studentGrades.clear();
        System.out.println("\nMap after clear()" + studentGrades);

    }
}
