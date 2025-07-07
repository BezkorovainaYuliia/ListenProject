package org.example.sacks;

public class Main {
    public static void main(String[] args) {
        String[] arraysString = new String[3];
        arraysString[0] = "Hello";
        arraysString[1] = "World";
        arraysString[2] = "Hello2";
        Sack sack = new Sack(arraysString);
        sack.print();
        System.out.println("-------------");
        sack.removeByIndex(1);
        sack.print();
    }
}
