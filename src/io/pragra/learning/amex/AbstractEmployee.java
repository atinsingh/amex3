package io.pragra.learning.amex;

public abstract class AbstractEmployee {
    private String name;

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public abstract void printDetails();

    public String getName() {
        return name;
    }
}
