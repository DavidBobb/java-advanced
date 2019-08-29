package com.sda.bobb.advanced.recap;

import java.util.List;

public class Student extends Person {

    private List<Integer> grades;

    public Student() {
    }

    public Student(String name, int age, Gender gender, List<Integer> grades) {
        super(name, age, gender);
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getName() +
                "\n" + "Age: " + getAge() +
                "\n" + "Gender: " + getGender() +
                "\n" + "Grades: " + grades;
    }
}
