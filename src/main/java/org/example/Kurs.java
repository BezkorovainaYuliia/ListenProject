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

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public int getRaum() {
        return raum;
    }

    public void setRaum(int raum) {
        this.raum = raum;
    }
}
