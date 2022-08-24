package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private final int age;
    private final transient int SSO;
    private int id;
    private String name;
    private transient String password;

    public Employee(int id, int age, String name, String password, int SSO) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.password = password;
        this.SSO = SSO;
    }

    public int getAge() {
        return age;
    }

    public int getSSO() {
        return SSO;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
