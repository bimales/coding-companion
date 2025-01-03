/*
 * Advantages: Easy to implement.
 * Disadvantages: Synchronizing the method can cause a performance bottleneck.
 * This ensures thread safety by synchronizing the getInstance method.
 */

package org.coding.companion.singleton;

public class SynchronizedMethod {

    private static SynchronizedMethod _instance;

    private SynchronizedMethod(){}

    public static synchronized SynchronizedMethod getInstance(){
        if (_instance == null){
            _instance = new SynchronizedMethod();
        }
        return _instance;
    }
}
