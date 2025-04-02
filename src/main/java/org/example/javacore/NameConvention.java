//Classes & Interfaces: PascalCase.
//
//Methods & Variables: camelCase.
//
//Constants: ALL_UPPERCASE.
//
//Packages: Lowercase.
//
//  Enums: PascalCase for the class and UPPERCASE for constants.

package org.example.javacore;

class Customer {
    // Constants
    public static final int MAX_ORDERS = 100;

    // Instance Variables (camelCase)
    private Long id;
    private String fullName;
    private String email;

    // Constructor (PascalCase)
    public Customer(Long id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    // Getter and Setter Methods (camelCase)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method (camelCase)
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
    }
}

public class NameConvention {

    public static void main(String[] args) {
        // Creating an object of the Customer class
        Customer customer = new Customer(1L, "John Doe", "john.doe@example.com");

        // Displaying customer info
        customer.displayCustomerInfo();
    }
}
