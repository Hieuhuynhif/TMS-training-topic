package org.example.javacore;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterGroup {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Brian", "David", "Alex", "Bella");

        // Step 1: Filter names starting with "A" or "B"
        // Step 2: Group by first letter
        Map<Character, List<String>> groupedNames = names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("B")) // Filter names
                .collect(Collectors.groupingBy(name -> name.charAt(0))); // Group by first letter

        // Print the grouped names

        groupedNames.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
