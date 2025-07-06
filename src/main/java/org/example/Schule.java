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

    public static void main(String[] args) {
        Schule schule = new Schule();
        schule.addStudent(new Student("Yuliia", "Bezkorovaina", 1));
        schule.addStudent(new Student("Daniel", "Protsak", 2));
        schule.addStudent(new Student("Tom", "Müller", 3));
        schule.addStudent(new Student("Hanna", "Schmitt", 4));
        schule.addStudent(new Student("Quan-Sek", "Han", 5));

        schule.printStudentList();

        Student studentById = schule.getStudentById(3);
        if (studentById == null){
            System.out.println("Student with id 3 is not found");
        } else{
            System.out.println("Student with id 3 is found. And it's " + studentById);
        }

        schule.deleteStudentById(3);
        schule.printStudentList();
    }
}
