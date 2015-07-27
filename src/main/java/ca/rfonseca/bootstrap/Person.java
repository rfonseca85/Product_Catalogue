package ca.rfonseca.bootstrap;

import java.io.Serializable;

public class Person implements Serializable {

    private final int id;

    private final String name;

    private final String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
