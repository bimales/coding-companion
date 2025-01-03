package org.coding.companion.breaksingleton;

import java.io.*;

public class SerializationAndDeserialization implements Serializable {
    private static final SerializationAndDeserialization instance = new SerializationAndDeserialization();

    private SerializationAndDeserialization() {
    }

    public static SerializationAndDeserialization getInstance() {
        return instance;
    }

    public static void main(String[] args) throws Exception {
        SerializationAndDeserialization s1 = SerializationAndDeserialization.getInstance();

        // Serialize the singleton
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(s1);
        out.close();

        // Deserialize the singleton
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializationAndDeserialization s2 = (SerializationAndDeserialization) in.readObject();
        in.close();

        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s2 hashcode: " + s2.hashCode());
    }
}
