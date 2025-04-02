package org.example.javacore;

public class Array {
    public static void main(String[] args) {
        // Initialize an array of strings
        String[] languages = new String[3];  // Array with 3 elements

        // Assign values to the array elements
        languages[0] = "Java";
        languages[1] = "Python";
        languages[2] = "C++";

        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }

        // Print the array using an enhanced for loop (foreach)
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
