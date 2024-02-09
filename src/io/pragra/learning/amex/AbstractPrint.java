package io.pragra.learning.amex;

public abstract class AbstractPrint {
    private String name;
    private String version;

    public AbstractPrint(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public abstract String getOs();

    public void print() {
        if(getOs().equals("WINDOW")) {
            System.out.println("Printing on Windows");
        }
    }

    public void scan() {
        if(getOs().equals("WINDOW") && version.equals("1.0")) {
            System.out.println("Version or OS not supported");
        }
    }

    public void fax() {

    }

}
