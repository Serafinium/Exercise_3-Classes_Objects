package com.kysylytsia;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws Exception {
        Employee employee1 = new Employee("Andrii", 1.5 , 14);
        Employee employee2 = new Employee("Mykola", 1.8 , 9);
        Employee employee3 = new Employee("Stepan", 0.6 , 6);

        System.out.println("total hours: " + Employee.totalHours);

        System.out.println("\nall information:");
        System.out.println("wager pre hour: " + Employee.wager + "$");
        System.out.println(employee1 + ",  salary+bonus: " + employee1.bonuses( employee1.getHours(), employee1.getRate() ) + "$" );
        System.out.println(employee2 + ",  salary+bonus: " + employee2.bonuses( employee2.getHours(), employee2.getRate() ) + "$" );
        System.out.println(employee3 + ",  salary+bonus: " + employee3.bonuses( employee3.getHours(), employee3.getRate() ) + "$" );

    }

}
