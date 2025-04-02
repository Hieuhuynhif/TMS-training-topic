package org.example.javacore;


import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Print the ArrayList
        System.out.println("ArrayList after adding elements:");
        for (String language : languages) {
            System.out.println(language);
        }

        // Modify an element at a specific index
        languages.set(2, "JavaScript"); // Change "C++" to "JavaScript"
        System.out.println("\nArrayList after modification:");
        for (String language : languages) {
            System.out.println(language);
        }

        // Remove an element by index
        languages.remove(0); // Remove the element at index 0 ("Java")
        System.out.println("\nArrayList after removing the first element:");
        for (String language : languages) {
            System.out.println(language);
        }

        // Remove an element by value
        languages.remove("Python"); // Remove "Python"
        System.out.println("\nArrayList after removing 'Python':");
        for (String language : languages) {
            System.out.println(language);
        }

        boolean containsJava = languages.contains("Java");
        System.out.println("\nDoes the list contain 'Java'? " + containsJava);

        // Get the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + languages.size());

        // Clear all elements in the ArrayList
        languages.clear();
        System.out.println("\nArrayList after clearing all elements: " + languages);
    }
}
