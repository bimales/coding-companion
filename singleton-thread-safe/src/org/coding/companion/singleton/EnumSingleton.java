/*
 * Using an enum is the simplest and most robust way to implement a singleton, as it handles serialization and threading issues inherently.
 * Advantages: Handles serialization, reflection, and thread safety automatically.
 * Disadvantages: Enum-based singletons cannot be lazily loaded.
 */

package org.coding.companion.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton using Enum");
    }

}
