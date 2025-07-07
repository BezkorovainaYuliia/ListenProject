package org.example.mapsAndsets;

import org.example.Kurs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchuleMaps {
    private Map<Integer, Student2> studentList = new HashMap<>();

    public void addStudent(int Id, Student2 student) {
        studentList.put(Id, student);
    }

    public void printStudentList() {
        System.out.println("Students list:");
        System.out.println("Students id\tVorname\tNachname");
        studentList.forEach((id, student) -> System.out.println(id + "\t" + student));
    }

    public Student2 getStudentById(int id) {
        return studentList.get(id);
    }

    public void deleteStudentById(int id) {
        studentList.remove(id);
    }

    public static void main(String[] args) {
        SchuleMaps schuleMaps = new SchuleMaps();

        Student2 student = new Student2("Yuliia", "Bezkorovaina");
        student.setKurses(new Kurs("Java", "Dominic", 0));
        student.setKurses(new Kurs("C++", "Tim", 1));
        schuleMaps.addStudent(1, student);

        student = new Student2("Daniel", "Protsak");
        student.setKurses(new Kurs("Java", "Dominic", 0));
        student.setKurses(new Kurs("UML", "Jana", 2));
        schuleMaps.addStudent(2, student);

        student = new Student2("Tom", "Müller");
        student.setKurses(new Kurs("UML", "Jana", 2));
        student.setKurses(new Kurs("C++", "Tim", 1));
        schuleMaps.addStudent(3, student);

        student = new Student2("Hanna", "Schmitt");
        student.setKurses(new Kurs("UML", "Jana", 2));
        student.setKurses(new Kurs("HTML", "Tim", 4));
        student.setKurses(new Kurs("Java", "Dominic", 0));
        schuleMaps.addStudent(4, student);

        student = new Student2("Quan-Sek", "Han");
        student.setKurses(new Kurs("CSS", "Yorn", 7));
        student.setKurses(new Kurs("HTML", "Tim", 4));
        student.setKurses(new Kurs("JavaScript", "Dina", 0));
        schuleMaps.addStudent(5, student);

        schuleMaps.printStudentList();

        Student2 studentById = schuleMaps.getStudentById(9);
        if (studentById == null){
            System.out.println("Student with id 9 is not found");
        } else{
            System.out.println("Student with id 3 is found. And it's " + studentById);
        }

        schuleMaps.deleteStudentById(3);
        schuleMaps.printStudentList();

        studentById = schuleMaps.getStudentById(4);
        if (studentById == null){
            System.out.println("Student with id 4 is not found");
        } else{
            System.out.println();
            System.out.println(studentById);
            System.out.println();
            List<Kurs> kurses = studentById.getKurses();
            for (Kurs kurs : kurses) {
                System.out.println(kurs);
            }
        }
    }
}
