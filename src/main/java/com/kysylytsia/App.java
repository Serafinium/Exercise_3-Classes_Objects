package com.kysylytsia;

/**
 * Hello world!
 *
 */
public class App {

    static int THIS_YEAR = 2017;

    public static void main( String[] args ) {

        Person person1 = new Person("Andrii", 1992);
        Person person2 = new Person("Viktor", 1988);
        Person person3 = new Person("Bogdan", 1997);
        Person person4 = new Person("Valery", 1975);
        Person person5 = new Person("Galina", 1986);


        person1.input("clever student.");
        person2.input("tolerant student.");
        person3.input("attentive student.");
        person4.input("capable student.");
        person5.input("funny student.");


        System.out.println(person1 + ", " + person1.age(THIS_YEAR) + " years old" + ",  information about person: " + person1.output() );
        System.out.println(person2 + ", " + person2.age(THIS_YEAR) + " years old" + ",  information about person: " + person2.output() );
        System.out.println(person3 + ", " + person3.age(THIS_YEAR) + " years old" + ",  information about person: " + person3.output() );
        System.out.println(person4 + ", " + person4.age(THIS_YEAR) + " years old" + ",  information about person: " + person4.output() );
        System.out.println(person5 + ", " + person5.age(THIS_YEAR) + " years old" + ",  information about person: " + person5.output() );
    }

}
