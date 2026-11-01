package com.mycompany.university;

class Student extends Person {

    private double grade;

    public Student(String name, int id, double grade) {
        super(name, id);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}
