package org.coding.companion.factorial;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0){return 0;}
        if (n==1){return 1;}
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }

}
