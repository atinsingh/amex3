package io.pragra.learning.amex;

public class HRMS {
    public void hireAnEmployee(Employee employee){
        employee.hire();
    }

    public void terminateEmployee(Employee employee){
        employee.terminate();
    }

    public void paySalary(Employee employee){
        System.out.println("Paying salary " + employee.calculateWage());
    }
//    public void showPerks(Employee employee){
//        ((FTE) employee).printPerks();
//    }

    public void playTime(Play play) {
        play.playTime();
        play.takeBreak();
    }
}
