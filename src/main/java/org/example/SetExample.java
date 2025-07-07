package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Peter","Müller", 1));
        students.add(new Student("Julia", "Kron", 2));
        students.add(new Student("Yorn", "Stein", 3));
        students.add(new Student("Max", "Stern", 4));
        students.add(new Student("Max", "Stern", 4)); // Doppelt
        students.add(new Student("Max", "Stern", 5));
        students.add(new Student("Maxim", "Stern", 5));

        System.out.println(students.toString());
        Set<Student> students2 = new TreeSet<>(students);
        System.out.println(students2.toString());
    }
}
