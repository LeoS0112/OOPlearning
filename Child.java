package org.example;

public class Child extends Parent{

    private String surname;
    private String name;

    Child(String surname, String name) {
        super(surname);
        this.name = name;

    }
}
