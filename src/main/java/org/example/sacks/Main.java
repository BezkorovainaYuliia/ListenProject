package org.example.sacks;

public class Main {
    public static void main(String[] args) {


        Integer[] arrays = new Integer[6];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        arrays[3] = 4;
        arrays[4] = 5;
        arrays[5] = 6;
        Sack sack = new Sack(arrays);
        sack.print();
        System.out.println("Element " + sack.get(0));
        System.out.println("-------------");
        sack.print();
        System.out.println("-------------");
        System.out.println("Element delete " + sack.removeLast());
        sack.print();
        System.out.println("Element delete " + sack.removeByIndex(3));
        sack.print();
        System.out.println("<--------------->");
        while (sack.size() != 0) {
            sack.removeLast();
        }
        sack.print();

        System.out.println("<--------------->");
        String[] arraysS = new String[6];
        arraysS[0] = "Hello";
        arraysS[1] = "Du";
        arraysS[2] = "bist";
        arraysS[3] = "ein";
        arraysS[4] = "Teilnehmer";
        arraysS[5] = "des Kurses";
        Sack sack2 = new Sack(arraysS);
        sack2.print();
        System.out.println("Element N2 ist " + sack2.get(2));
        System.out.println("-------------");
        sack2.print();
        System.out.println("-------------");
        System.out.println("Element delete " + sack2.removeLast());
        sack2.print();
        System.out.println("Element delete " + sack2.removeByIndex(3));
        sack2.print();

    }
}
