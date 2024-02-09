package io.pragra.learning.amex;

public class FTE extends AbstractEmployee implements Employee, Play{
    private double ctc;

    public FTE(String name, double ctc) {
        super(name);
        this.ctc = ctc;
    }

    @Override
    public void hire() {
        System.out.println("Issue Offer and Onboard");
    }

    @Override
    public void terminate() {
        System.out.println("Pay Severance and Release");
    }

    @Override
    public double calculateWage() {
        return ctc/12;
    }
    public void printPerks(){
        System.out.println("Group Insurnace and Life Benefits");
    }

    @Override
    public void playTime() {
        System.out.println("Having some fun time");
    }

    @Override
    public void takeBreak() {
        System.out.println("Time to Break");
    }

    @Override
    public void printDetails() {
        System.out.println("ctc = " + ctc);
        System.out.println("name =  " + getName());
    }
}
