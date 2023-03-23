package javaoop._3;

import javaoop._3.Student;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student persona = new Student();
        persona.setName("Pietro");
        persona.setSurName("Benedicenti");
        persona.setAge(2);
        persona.setBestColor("Blallo");
        persona.setPet("Dahù");
        System.out.println(persona.getName()+","+ persona.getSurName()+","+persona.getAge()+","+persona.getBestColor()+"," + persona.getPet());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setAge(20);
        student2.setAge(21);
        int age = student1.getAge();
        int ageAccessCount = student1.getAgeGetterCounter();
        System.out.println("Age: " + student1.getAge() +" "+ "Age: " + student2.getAge());
        System.out.println("Age access count: " + ageAccessCount);
        //Write your code here
    }

}
