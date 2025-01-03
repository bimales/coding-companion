/*
 * Advantages: Reduces synchronization overhead, thread-safe, and efficient.
 * Disadvantages: More complex to implement.
 * This reduces the performance overhead by synchronizing only the critical section.
 */
package org.coding.companion.singleton;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking _instance;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){
        if (_instance == null){
            synchronized (DoubleCheckedLocking.class){
                if (_instance==null){
                    _instance = new DoubleCheckedLocking();
                }
            }
        }
        return _instance;
    }
}
