package deserialization;

import serialization.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            System.out.println("Deserialization has been started!!");

            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Employee readObject = (Employee) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Employee id: " + readObject.getId());
            System.out.println("Employee name: " + readObject.getName());
            System.out.println("Employee age: " + readObject.getAge());
            System.out.println("Employee password: " + readObject.getPassword());
            System.out.println("Employee SSO: " + readObject.getSSO());

            System.out.println("Deserialization has been ended!!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
