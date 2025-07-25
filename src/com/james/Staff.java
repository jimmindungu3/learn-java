package com.james;

public class Staff {
    String name;
    String staffId;

    Staff(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public void introduce() {
        System.out.println("I am " + name + ", staff ID: " + staffId);
    }
}

class Teacher extends Staff {
    String subject;
    Teacher(String name, String staffId, String subject) {
        super(name, staffId);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("I am " + name + " ID: " + staffId + ", and I teach " + subject);
    }
}

class  Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Alex", "S001");
        Teacher teacher = new Teacher("James", "T001", "Java");

        staff.introduce();
        teacher.introduce();
    }
}