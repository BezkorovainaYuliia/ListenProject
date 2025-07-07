package org.example.maps;


public class Medication {
    private String name;
    private double price;
    private int availability;

    public Medication(String name, double price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return name +
                " kostet " + price +
                " und die Aphoteke hat " + availability +
                " Stück";
    }
}
