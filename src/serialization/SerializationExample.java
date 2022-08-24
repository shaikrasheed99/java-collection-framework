package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee(1, 10, "Ironman", "Ironman123", 123);

        try {
            System.out.println("Serialization has been started!!");

            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream stream = new ObjectOutputStream(fileOutputStream);

            stream.writeObject(employee);

            stream.close();
            fileOutputStream.close();

            System.out.println("Serialization has been ended!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
