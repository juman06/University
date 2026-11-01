package com.mycompany.university;

class Professor extends Person implements Payable {

    private double basicSalary;

    public Professor(String name, int id, double salary) {
        super(name, id);
        this.basicSalary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Professor: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 1500;
    }
}
