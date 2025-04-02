package org.example.javacore;

import java.util.*;

public class JavaCollectionFramework {

    //    ArrayList (ordered, allows duplicates)
    //    HashSet (unordered, no duplicates)
    //    HashMap (key-value store, unique keys)

    public static void main(String[] args) {
        // List Example (Allows duplicates, maintains order)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // Duplicates allowed
        System.out.println("List: " + list);

        // Set Example (No duplicates, unordered)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate ignored
        System.out.println("Set: " + set);

        // Map Example (Key-Value pairs, unique keys)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Uno"); // Overwrites key 1
        System.out.println("Map: " + map);

        System.out.println("Iterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
