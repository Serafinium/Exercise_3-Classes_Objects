package com.kysylytsia;

/**
 * Created by SERAFIM on 03.11.2017.
 */
public class Person {

    private String name;
    private int birthYear;
    private String personInformation;


    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public Person() {}

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.personInformation = "";
    }


    /**
     * This method calculates the age of a person based on the current year and year of birth
     * @param today
     * @return
     */
    public int age(int today){
        return today - getBirthYear();
    }


    /**
     * This method input information about person
     * @param information
     */
    public void input (String information){

       personInformation = personInformation.concat(information);
    }


    /**
     * This method output information about person
     * @return
     */
    public String output (){
        return personInformation;
    }


    /**
     * This method change the name of person
     * @param name
     */
    public void changeName (String name){
        this.name = name;
    }


    /**
     * Override toString method
     * @return
     */
    @Override
    public String toString() {
        return "Person: " + name;
    }
}
