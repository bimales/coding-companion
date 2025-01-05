# Custom Exception

Implementing a custom exception in Java allows you to define application-specific exceptions that provide meaningful error messages and tailored behavior. Here's a step-by-step guide:

Steps to Create a Custom Exception
Extend an Exception Class:

Extend either:
Exception (for checked exceptions)
RuntimeException (for unchecked exceptions).
Define Constructors:

Provide constructors to initialize the exception message and/or cause.
(Optional) Add Custom Methods:

Include methods for specific behavior or additional data.
Example: Checked Custom Exception
Use Case: Let's create a custom exception called InvalidAgeException for validating user age.

Code:

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
public class CustomExceptionExample {
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


Example: Unchecked Custom Exception
Use Case: Let's create a custom unchecked exception called InsufficientBalanceException.

Code:

// Define a custom unchecked exception
class InsufficientBalanceException extends RuntimeException {
public InsufficientBalanceException(String message) {
super(message);
}

    public InsufficientBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Test the custom exception
public class CustomUncheckedExceptionExample {
public static void withdraw(double balance, double amount) {
if (amount > balance) {
throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
}
System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
}

    public static void main(String[] args) {
        try {
            withdraw(500, 600); // This will throw an exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}


### When to Use Checked vs. Unchecked Exceptions
Checked Exceptions: Use for recoverable conditions that the caller should explicitly handle (e.g., invalid input, missing resources).
Unchecked Exceptions: Use for programming errors or conditions that indicate misuse (e.g., illegal argument, null pointer).
Best Practices
Meaningful Naming: Name the exception class to clearly describe the error.
Detailed Messages: Provide descriptive error messages for debugging.
Custom Behavior: Add methods or fields if additional context is required (e.g., an error code or timestamp).
Consistency: Use checked exceptions for business logic errors and unchecked exceptions for programming errors.
Let me know if you'd like to explore advanced use cases or error-handling strategies!