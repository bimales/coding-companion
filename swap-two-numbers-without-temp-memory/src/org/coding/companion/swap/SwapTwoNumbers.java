/*
 * Java program to swap two numbers without using a temporary variable
 */
package org.coding.companion.swap;

import org.junit.jupiter.api.Test;

public class SwapTwoNumbers {

    public void swapTwoNumbers(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(" num1 : " + num1);
        System.out.println(" num2 : " + num2);
    }

    @Test
    public  void testSwapTwoNumbers() {
        swapTwoNumbers(2,11);
    }
}
