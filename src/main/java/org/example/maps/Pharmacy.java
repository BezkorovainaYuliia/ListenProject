package org.example.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pharmacy {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.setMedication();
        System.out.println("Die Apotheke :");
        System.out.println(pharmacy.getMedication("Vitamin D3+K2"));
        System.out.println("Die Apotheke hat " + pharmacy.getCount("Ibuprofen") + " Stück");

        Medication newMedication = new Medication("Nemisil", 20.2, 2);
        pharmacy.save(newMedication);

        System.out.println("Die Apotheke :");
        pharmacy.printAllMedications();

        pharmacy.delete("Nemisil");
        System.out.println("Die Apotheke ohne Nemisil :");
        pharmacy.printAllMedications();

    }

    private Map<String, Medication> medications = new LinkedHashMap<>();

    public void printAllMedications() {
        medications.forEach((name, medication) -> System.out.println(name+"\t"+medication));
    }
    public Map<String, Medication> getMedications() {
        return medications;
    }

    public int getCount(String medicationName) {
        Medication medication = medications.get(medicationName);
        return medication.getAvailability();
    }

    public void save(Medication medication){
        medications.put(medication.getName(), medication);
    }

    public Medication getMedication(String medicationName){
        return medications.get(medicationName);
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
    }

    public void setMedications(Map<String, Medication> medications){
        this.medications = medications;
    }

    public void setMedication(String medicationName, Medication medication){
        medications.put(medicationName, medication);
    }

    public void setMedication(){
        Medication medicament = new Medication("Ibuprofen", 4.5,50);
        medications.put(medicament.getName(), medicament);
        medicament = new Medication("Nasetropf", 1.3,20);
        medications.put(medicament.getName(), medicament);
        medicament = new Medication("Vitamin D3+K2", 3.6,15);
        medications.put(medicament.getName(), medicament);
        medicament = new Medication("Augentropf", 7.1,3);
        medications.put(medicament.getName(), medicament);
        medicament = new Medication("Panthenol", 3.0,7);
        medications.put(medicament.getName(), medicament);
    }
}
