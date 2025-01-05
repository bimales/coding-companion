package org.coding.companion.customexception;

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
class CustomUncheckedExceptionExample {
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
