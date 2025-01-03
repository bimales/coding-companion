/*
 * This approach leverages the Java class loader mechanism to ensure thread safety.
 * Advantages: Simple, lazy-loaded, thread-safe without explicit synchronization.
 * Disadvantages: None for most use cases.
 */
package org.coding.companion.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {}

    // Static inner class - loaded only when getInstance is called
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
