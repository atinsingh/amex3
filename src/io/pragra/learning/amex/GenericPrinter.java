package io.pragra.learning.amex;

import java.util.Scanner;

public class GenericPrinter implements IPrint{
    @Override
    public void print(String line) {
        System.out.println("line = " + line);
    }

    @Override
    public String scan() {
        Scanner scanner = new Scanner(System.in);// Read from console
        System.out.println("Please enter text");
        return scanner.nextLine();
    }

    @Override
    public void fax() {
        System.out.println("Fax sent........");
    }
}
