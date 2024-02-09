package io.pragra.learning.amex;

public class Contractor implements Employee{
    private double hourlyRate;

    public Contractor(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void hire() {
        System.out.println("Issue Work order and onboard");
    }

    @Override
    public void terminate() {
        System.out.println("Release with 2 weeks notice");
    }

    @Override
    public double calculateWage() {
        return hourlyRate*160;
    }

}
