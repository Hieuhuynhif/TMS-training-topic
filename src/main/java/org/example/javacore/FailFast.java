package org.example.javacore;

import java.util.ArrayList;

public class FailFast {
    public static void main(String[] args) {
        // Creating a fail-fast collection (ArrayList)
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Get the iterator from the list

        // Modifying the list while iterating (this will throw ConcurrentModificationException)
        for (String language : list) {
            System.out.println(language);
            // Modifying the list while iterating
            list.add("JavaScript");  // This will cause a ConcurrentModificationException
        }

    }

}
