package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String vorName;
    private String nachName;
    private int id;

    public Student(String nvorNme, String nachName, int id) {
        this.vorName = nvorNme;
        this.nachName = nachName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return vorName + "\t" + nachName + "\t" + id;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yuliia", "Bezkorovaina", 1));
        students.add(new Student("Daniel", "Protsak", 2));
        students.add(new Student("Tom", "Müller", 3));
        students.add(new Student("Hanna", "Schmitt", 4));
        students.add(new Student("Quan-Sek", "Han", 5));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
