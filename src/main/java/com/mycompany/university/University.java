package com.mycompany.university;

public class University {

    public static void main(String[] args) {
        System.out.println("University");

        Person p1 = new Student("Ahmed", 101, 95.5);
        Person p2 = new Professor("Mohamed", 201, 5000);
        Course course = new Course("Java Programming", 501, 3);

course.displayCourse();

        System.out.println("\nPolymorphism:");

        p1.displayInfo();
        System.out.println();

        p2.displayInfo();

        System.out.println("\nGeneric class: ");

        Storage<String> studentStorage = new Storage<>();
        studentStorage.setData("Ahmed");

        Storage<Integer> idStorage = new Storage<>();
        idStorage.setData(101);

        System.out.println("Stored Name: "
                + studentStorage.getData());

        System.out.println("Stored ID: "
                + idStorage.getData());

        System.out.println("\nInterface:");

        Payable employee = (Payable) p2;

        System.out.println("Professor Salary: "
                + employee.calculateSalary());
    }
}