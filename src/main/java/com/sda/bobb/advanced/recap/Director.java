package com.sda.bobb.advanced.recap;

public class Director extends Professor {

    public void pay(double amount) {
        super.setSalary(amount * 2);
    }

    public Director() {
    }

    public Director(String name, int age, Gender gender, String subject, double salary) {
        super(name, age, gender, subject, salary);
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getName() +
                "\n" + "Age: " + getAge() +
                "\n" + "Gender: " + getGender() +
                "\n" + "Subject: " + getSubject() +
                "\n" + "Salary: " + getSalary();
    }
}
