package javaoop._2;

public class Student {
 String name;
  Integer age;


    public Student(String name, Integer age) {

        this.name = name;
        this.age = age;
    }
    public Student(String name) {
        this.name = name;

    }
    public Student(Integer age) {
        this.age = age;
    }

    public Student() {

    }



    public String toString() {
        return name + " " + age;

    }




}

