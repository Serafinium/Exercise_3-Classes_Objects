package com.kysylytsia;

/**
 * Created by SERAFIM on 03.11.2017.
 */
public class Student {

    /**
     * average rating of all students
     */
    static double avgRating = 0;


    /**
     * we need to create a variable count the created objects
     */
    static int count = 0;


    private String name;
    private int rating;

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }



    public Student() {}

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        avgRating += rating;
        count ++;
    }


    /**
     * this method compare two objects, and return boolean variable which depends whose rating bigger.
     * @param student
     * @return
     */
    public boolean betterStudent (Student student){
        return this.getRating() < student.getRating() ? true : false;
    }


    /**
     * Override toString method witch displays information about the studentstudent
     * @return
     */
    @Override
    public String toString() {
        return "Student" + count +
                "  name: '" + name + '\'' +
                "  rating: " + rating;
    }


    /**
     * ChangeRating - to change the rating of student
     * @param rating
     */
    public void changeRating(int rating) {
        this.rating = rating;
    }
}
