package designPatterns.creational.singleton.breakingSingletonPattern.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        UserBean s1 = UserBean.createUserObject();

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
        oos.writeObject(s1);

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
        UserBean s2 = (UserBean) ois.readObject();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // Different ❌
    }

}
