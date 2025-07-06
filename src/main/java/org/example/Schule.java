package org.example;

import java.util.ArrayList;
import java.util.List;

public class Schule {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void printStudentList() {
        System.out.println("Students list:");
        System.out.println("Vorname\tNachname\tStudents id");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public Student getStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public void deleteStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id){
                studentList.remove(student);
                break;
            }
        }
    }

    public List<Kurs> getKurses(int id) {
        Student student = getStudentById(id);
        return student.getKurses();
    }

    public static void main(String[] args) {
        Schule schule = new Schule();

        Student student = new Student("Yuliia", "Bezkorovaina", 1);
        student.setKurses(new Kurs("Java", "Dominic", 0));
        student.setKurses(new Kurs("C++", "Tim", 1));
        schule.addStudent(student);

        student = new Student("Daniel", "Protsak", 2);
        student.setKurses(new Kurs("Java", "Dominic", 0));
        student.setKurses(new Kurs("UML", "Jana", 2));
        schule.addStudent(student);

        student = new Student("Tom", "Müller", 3);
        student.setKurses(new Kurs("UML", "Jana", 2));
        student.setKurses(new Kurs("C++", "Tim", 1));
        schule.addStudent(student);

        student = new Student("Hanna", "Schmitt", 4);
        student.setKurses(new Kurs("UML", "Jana", 2));
        student.setKurses(new Kurs("HTML", "Tim", 4));
        student.setKurses(new Kurs("Java", "Dominic", 0));
        schule.addStudent(student);

        student = new Student("Quan-Sek", "Han", 5);
        student.setKurses(new Kurs("CSS", "Yorn", 7));
        student.setKurses(new Kurs("HTML", "Tim", 4));
        student.setKurses(new Kurs("JavaScript", "Dina", 0));
        schule.addStudent(student);

        schule.printStudentList();

        Student studentById = schule.getStudentById(3);
        if (studentById == null){
            System.out.println("Student with id 3 is not found");
        } else{
            System.out.println("Student with id 3 is found. And it's " + studentById);
        }

        schule.deleteStudentById(3);
        schule.printStudentList();

        studentById = schule.getStudentById(4);
        if (studentById == null){
            System.out.println("Student with id 3 is not found");
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
