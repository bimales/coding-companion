package org.coding.companion.customexception;

// Define a custom checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass the message to the superclass
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause); // Pass the message and cause to the superclass
    }
}

// Test the custom exception
 class CustomExceptionExample {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
