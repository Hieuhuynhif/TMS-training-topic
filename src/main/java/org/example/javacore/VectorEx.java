package org.example.javacore;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        // Create a Vector to store strings
        Vector<String> languages = new Vector<>();

        // Add elements to the Vector
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Print the Vector
        System.out.println("Vector after adding elements:");
        for (String language : languages) {
            System.out.println(language);
        }

        // Access an element by index
        System.out.println("\nAccessing the second element (index 1): " + languages.get(1));

        // Modify an element at a specific index
        languages.set(2, "JavaScript"); // Change "C++" to "JavaScript"
        System.out.println("\nVector after modification:");
        for (String language : languages) {
            System.out.println(language);
        }

        // Remove an element by index
        languages.remove(0); // Remove the element at index 0 ("Java")
        System.out.println("\nVector after removing the first element:");
        for (String language : languages) {
            System.out.println(language);
        }

        // Remove an element by value
        languages.remove("Python"); // Remove "Python"
        System.out.println("\nVector after removing 'Python':");
        for (String language : languages) {
            System.out.println(language);
        }

        // Check if the Vector contains a specific element
        boolean containsJava = languages.contains("Java");
        System.out.println("\nDoes the Vector contain 'Java'? " + containsJava);

        // Get the size of the Vector
        System.out.println("\nSize of the Vector: " + languages.size());

        // Clear all elements in the Vector
        languages.clear();
        System.out.println("\nVector after clearing all elements: " + languages);
    }
}
