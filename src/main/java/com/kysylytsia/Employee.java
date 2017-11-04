package com.kysylytsia;

/**
 * Created by SERAFIM on 03.11.2017.
 */
public class Employee {
    private String name;
    private double rate;
    private int hours;

    // dollars per hour
    static final int wager = 5;
    static int totalHours;

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public Employee() {}

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) throws Exception {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        Employee.totalHours += hours;
        if (hours<0){
            throw  new Exception("incorrectlySpecifiedTimeExeption");
        }
    }


    /**
     * this method calculate the salary of person.
     * @param rate
     * @param hours
     * @return
     */
    public int salary(double rate, int hours){
        return (int)rate * hours;
    }


    /**
     * this method change rate of employee
     * @param rate
     */
    public void changeRate(double rate){
        this.rate = rate;
    }




    /**
     * this method calculate salary and bonuses with mathematical rounding downward
     * @param time
     * @param rate
     * @return
     */
    public int bonuses (int time, double rate){
        int bonus;
        switch (time){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: bonus = (int)(time * wager * rate);
                    break;
            case 9:
            case 10: bonus = (int)(time * wager * (rate + 0.15) );
                     break;
            case 11:
            case 12: bonus = (int)(time * wager * (rate + 0.20) );
                     break;
            case 13:
            case 14: bonus = (int)(time * wager * (rate + 0.25) );
                     break;
            case 15:
            case 16: bonus = (int)(time * wager * (rate + 0.30) );
                     break;
            default:
                System.out.println("Good job, Terminator! :)");
                bonus = 1000;
        }
        return bonus;
    }

    /**
     * Override toString method
     * @return
     */
    @Override
    public String toString() {
        return  "Employee: " + name + ",  " +
                "rate = " + rate + "," +
                "  worked hours: " + hours;
    }
}
