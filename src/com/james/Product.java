package com.james;

public class Product {
    private double price;

    public void setPrice(double p) {
        if (p > 0) {
            price = p;
        } else {
            System.out.println("Price cannot be 0 or less");
        }
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product salt = new Product();
        Product sugar = new Product();
        Product fake = new Product();

        salt.setPrice(4.99);
        sugar.setPrice(9.99);
        fake.setPrice(-5.00);

        System.out.println("Price of salt: " + salt.getPrice());;
        System.out.println("Price of sugar: " + sugar.getPrice());;
        System.out.println("Price of fake: " + fake.getPrice());
    }
}

/*
Case Study: University Course Registration
Design a simple system to manage students and the courses they register for.

REQUIREMENTS
Each student has a name and a registration number.
Each student can register for a course by name.
Prevent students from registering for an empty course name.
Keep track of how many total registrations have occurred.
Display student and course details.
*/

class Student {
    private String studentName;
    private String admNo;

    Student(String studentName, String admNo) {
        this.studentName = studentName;
        this.admNo = admNo;
    }

    public String getAdmNo() {
        return admNo;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Course {
    private String courseName;
    private int registrationCount;

    Course(String courseName) {
        if (courseName.length() >= 4) {
            this.courseName = courseName;
        } else {
            System.out.println("Invalid course name");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void studentCourseRegistration(Student student) {
        if (courseName != null && courseName.length() >= 4) {
            registrationCount++;
            System.out.println(student.getStudentName() + " registered for " + courseName);
        } else {
            System.out.println("Cannot register to invalid course");
        }
    }

    public int getRegistrationCount() {
        return registrationCount;
    }

    public static void main(String[] args) {
        Course java = new Course("OOP in Java");
        Course taxLaw = new Course("Taxation Law");

        Student james = new Student("James", "CS001");
        Student alex = new Student("Alex", "BS001");

        java.studentCourseRegistration(james);
        taxLaw.studentCourseRegistration(alex);

        System.out.println("Java registrations: " + java.getRegistrationCount());
        System.out.println("Tax Law registrations: " + taxLaw.getRegistrationCount());
    }
}
































