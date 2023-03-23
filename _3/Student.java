package javaoop._3;

public class Student {
    private String name;
    private String surName;
    private Integer age;
    private String bestColor;
    private String pet;
    private int ageGetterCounter;


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Integer getAge() {
        ageGetterCounter++;
        return age;
    }

    public String getBestColor() {
        return bestColor;
    }

    public String getPet() {
        return pet;
    }

    public int getAgeGetterCounter() {
        return ageGetterCounter;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null");
        } else {
            this.name = name;
        }
    }

    public void setSurName(String surName) {
        if (surName == null || surName.trim().isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be empty or null");
        } else {
            this.surName = surName;
        }
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be always greater than zero");
        } else {
            this.age = age;
        }
    }

    public void setBestColor(String bestColor) {
        this.bestColor = bestColor;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }




}
