package javaoop._2;
import java.util.List;
public class Student {
    private String name;
    private int age;

   public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name){
        this(name, 0);
    }
    public Student(int age){
       this("",age);
    }
    public Student() {
       this("",0);
   }
    public String getName(){
       return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public int getAge(){
       return age;
    }
    public void setAge(int age){
       this.age = age;
    }

   public String toString() {
        if (!name.isEmpty() && age != 0) {
            return name + " " + age;
        } else if (!name.isEmpty()) {
            return name;
        } else if (age != 0) {
            return Integer.toString(age);
        } else {
            return "Studente senza nome ed età";
        }




}}

