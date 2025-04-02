package org.example.javacore;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        // Creating a fail-safe collection (CopyOnWriteArrayList)
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Get the iterator from the list

        // Modifying the list while iterating (this is safe)
        for (String language : list) {
            System.out.println(language);
            // Modifying the list while iterating
            list.add("JavaScript");  // This will NOT throw an exception
        }

        System.out.println("Modified List: " + list);
    }
}
