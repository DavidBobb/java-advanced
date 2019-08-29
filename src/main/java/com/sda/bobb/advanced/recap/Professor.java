package com.sda.bobb.advanced.recap;

public class Professor extends Person implements Payable {

    public void pay(double amount) {
        this.salary = amount;
    }

    private String subject;
    private double salary;

    public Professor() {
    }

    public Professor(String name, int age, Gender gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + getName() +
                "\n" + "Age: " + getAge() +
                "\n" + "Gender: " + getGender() +
                "\n" + "Subject: " + subject +
                "\n" + "Salary: " + salary;
    }
}
