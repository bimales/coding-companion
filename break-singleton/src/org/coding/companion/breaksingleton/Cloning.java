package org.coding.companion.breaksingleton;

public class Cloning implements Cloneable{
    private static final Cloning instance = new Cloning();

    private Cloning() {}

    public static Cloning getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Cloning s1 = Cloning.getInstance();
        Cloning s2 = (Cloning) s1.clone();

        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s2 hashcode: " + s2.hashCode());
    }
}
