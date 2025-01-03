package org.coding.companion.breaksingleton;

public class Multithreading {
    private static Multithreading instance;

    private Multithreading() {}

    public static Multithreading getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(100); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Multithreading();
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton s1 = Singleton.getInstance();
            System.out.println("s1 hashcode: " + s1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            Singleton s2 = Singleton.getInstance();
            System.out.println("s2 hashcode: " + s2.hashCode());
        });

        t1.start();
        t2.start();
    }
}
