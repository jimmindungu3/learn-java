
class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("My name is " + name);
    }
}

class Student extends Person {
    String course;

    Student(String name, String id, String course) {
        super(name, id); // ✅ calls Person constructor
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("My name is " + name + ", ID: " + id + ", Course: " + course);
    }
}

class Lecturer extends Person {
    String department;

    Lecturer(String name, String id, String department) {
        super(name, id); // ✅ calls Person constructor
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("My name is " + name + ", Department: " + department);
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "P001");
        Student student = new Student("James Ndungu", "S001", "Java");
        Lecturer lecturer = new Lecturer("Jasper Ondulo", "I001", "ICT");

        person.displayInfo();
        student.displayInfo();
        lecturer.displayInfo();
    }
}
