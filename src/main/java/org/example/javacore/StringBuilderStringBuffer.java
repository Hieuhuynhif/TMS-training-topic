package org.example.javacore;

public class StringBuilderStringBuffer {

    public static void main(String[] args) {
        // Using StringBuilder (faster but not synchronized)
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.append(" World!");
        System.out.println(strBuilder); // Output: Hello World!

            // Using StringBuffer (synchronized and thread-safe)
        StringBuffer strBuffer = new StringBuffer("Hello");
        strBuffer.append(" World!");
        System.out.println(strBuffer); // Output: Hello World!
    }
}
