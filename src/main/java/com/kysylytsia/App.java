package com.kysylytsia;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Student student1 = new Student("Andrii", 96);
        Student student2 = new Student("Oksana", 88);
        Student student3 = new Student("Mykola", 99);



        System.out.println( "total rating: " + Student.avgRating );
        System.out.println( "average rating: " + Student.avgRating / Student.count );

        System.out.println();
        System.out.println("personal rating: \n" + student1 + "\n" + student2 + "\n" + student3);


        // let's compare the student's rating among themselves.
        System.out.println("compare two students by rating: \n");
        System.out.println("compare two student");
        System.out.println("Student2 > Student1??! :  " + student1.betterStudent(student2) );
        System.out.println("Student3 > Student1??! :  " + student1.betterStudent(student3) );
        System.out.println("Student2 > Student3??! :  " + student3.betterStudent(student2));
    }
}
