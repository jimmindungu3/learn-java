package com.james;

public class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("James", 31);

        // Use getters
        System.out.println(person.getName() + " " + person.getAge());

        // Use setters to update values
        person.setName("John");
        person.setAge(25);

        // Print updated values using getters
        System.out.println(person.getName() + " " + person.getAge());

        testStaticModifier();
    }

    static void testStaticModifier() {
        System.out.println("With 'static', I can be called without creating a Person instance");
    }
}
