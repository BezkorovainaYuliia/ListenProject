package org.example.mapsAndsets;

import org.example.Kurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student2 implements Comparable<Student2> {
    @Override
    public int compareTo(Student2 o) {

        int lastNameComparison = this.nachName.compareToIgnoreCase(o.nachName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return this.vorName.compareToIgnoreCase(o.vorName);
    }

    private String vorName;
    private String nachName;
    private List<Kurs> kurses = new ArrayList<>();

    public Student2(String nvorNme, String nachName) {
        this.vorName = nvorNme;
        this.nachName = nachName;
    }

    public void setKurses(Kurs kurs) {
        this.kurses.add(kurs);
    }

    public List<Kurs> getKurses() {
        return kurses;
    }

    @Override
    public String toString() {
        return vorName + "\t" + nachName;
    }

    public static void main(String[] args) {
        List<Student2> student2s = new ArrayList<>();
        student2s.add(new Student2("Yuliia", "Bezkorovaina"));
        student2s.add(new Student2("Daniel", "Protsak"));
        student2s.add(new Student2("Tom", "Müller"));
        student2s.add(new Student2("Hanna", "Schmitt"));
        student2s.add(new Student2("Quan-Sek", "Han"));
        for (Student2 student2 : student2s) {
            System.out.println(student2);
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

    public void setKurses(List<Kurs> kurses) {
        this.kurses = kurses;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student2 student2 = (Student2) object;
        return Objects.equals(vorName, student2.vorName) && Objects.equals(nachName, student2.nachName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorName, nachName);
    }
}
