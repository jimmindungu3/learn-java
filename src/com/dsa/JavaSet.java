package com.dsa;

import java.util.Set;
import java.util.HashSet;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> students = new HashSet<String>();
        students.add("James");
        students.add("Nganga");
        students.add("Ndungu");

        System.out.println(students);
        System.out.println(students.size()); // 3
        System.out.println(students.isEmpty()); // false
        System.out.println(students.contains("James")); // true
        students.add("Alex");
        System.out.println(students); // (James, Nganga, Ndungu, Alex) // random order
        students.remove("Alex");
        System.out.println(students); // (James, Nganga, Ndungu) // random order

        for (String name : students) {
            System.out.println(name);
        }
        }
}
