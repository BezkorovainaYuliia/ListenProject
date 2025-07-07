package org.example.mapsAndsets;

import org.example.Kurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student2{

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
