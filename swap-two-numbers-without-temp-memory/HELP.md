# Write a program to swap two numbers without using a temporary variable.

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using arithmetic operations
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of 'a' from 'b'
        a = a - b; // Step 3: Subtract the new value of 'b' from 'a'

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}


Explanation
Steps:
Add the two numbers and store the sum in a:
𝑎
=
𝑎
+
𝑏
a=a+b
Subtract the updated a from b to calculate the original value of a:
𝑏
=
𝑎
−
𝑏
b=a−b
Subtract the updated b from a to calculate the original value of b:
𝑎
=
𝑎
−
𝑏
a=a−b
Example:
Initial values:
𝑎
=
5
a=5,
𝑏
=
3
b=3
Step 1:
𝑎
=
𝑎
+
𝑏
=
5
+
3
=
8
a=a+b=5+3=8
Step 2:
𝑏
=
𝑎
−
𝑏
=
8
−
3
=
5
b=a−b=8−3=5
Step 3:
𝑎
=
𝑎
−
𝑏
=
8
−
5
=
3
a=a−b=8−5=3
After swapping:
𝑎
=
3
,
𝑏
=
5
a=3,b=5.