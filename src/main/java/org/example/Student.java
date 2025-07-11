package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {

        return Integer.compare(this.id, o.id);
    }

    private String vorName;
    private String nachName;
    private int id;
    private List<Kurs> kurses = new ArrayList<>();

    public Student(String nvorNme, String nachName, int id) {
        this.vorName = nvorNme;
        this.nachName = nachName;
        this.id = id;
    }

    public void setKurses(Kurs kurs) {
        this.kurses.add(kurs);
    }

    public List<Kurs> getKurses() {
        return kurses;
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

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKurses(List<Kurs> kurses) {
        this.kurses = kurses;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return id == student.id && Objects.equals(vorName, student.vorName) && Objects.equals(nachName, student.nachName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorName, nachName, id);
    }
}
