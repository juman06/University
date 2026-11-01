package com.mycompany.university;


class Course {

    private String courseName;
    private int courseCode;
    private double creditHours;

    public Course(String courseName, int courseCode,
                  double creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credit Hours: " + creditHours);
    }
}
