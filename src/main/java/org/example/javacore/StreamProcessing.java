package org.example.javacore;

import java.util.Arrays;
import java.util.List;

public class StreamProcessing {

    public static void main(String[] args) {
        // Example data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> languages = Arrays.asList("Java", "Python", "C", "JavaScript", "Go", "Ruby", "Java");

        // Processing the numbers and languages in a single pipeline
        List<String> result = languages.stream()
                // Filter languages starting with 'J'
                .filter(lang -> lang.startsWith("J"))
                // Map each language to uppercase
                .map(String::toUpperCase)
                // Sort the languages alphabetically
                .sorted()
                // Remove duplicates
                .distinct()
                // Collect the result into a list
                .toList();
        // Printing the result
        System.out.println("Filtered, mapped, sorted, and distinct languages: " + result);

        // Using the same numbers list for reduction and further operations
        int sum = numbers.stream()
                // Filter even numbers
                .filter(n -> n % 2 == 0)
                // Reduce by summing the filtered numbers
                .reduce(0, Integer::sum); // Starting value is 0
        System.out.println("Sum of even numbers: " + sum);

        // Using the forEach operation to print each language from the filtered list
        System.out.print("Filtered languages (using forEach): ");
        result.forEach(lang -> System.out.print(lang + " "));
    }
}
