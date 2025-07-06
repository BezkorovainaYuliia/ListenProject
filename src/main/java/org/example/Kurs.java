package org.example;

public class Kurs {
    private String kursName;
    private String dozent;
    private int raum;

    public Kurs(String kursName, String dozent, int raum) {
        this.kursName = kursName;
        this.dozent = dozent;
        this.raum = raum;
    }

    @Override
    public String toString() {
        return kursName + '\t' +
                dozent + '\t' +
                raum;
    }
}
