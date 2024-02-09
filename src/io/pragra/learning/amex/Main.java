package io.pragra.learning.amex;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HRMS hrms = new HRMS();
        Employee employee = new FTE("Vivek",100000);
        hrms.hireAnEmployee(employee);
        hrms.paySalary(employee);
        hrms.playTime(((Play) employee));


    }
}

interface A {

}
interface B {

}
interface C extends A,B {

}