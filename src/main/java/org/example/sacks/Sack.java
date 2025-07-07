package org.example.sacks;

public class Sack implements SackList {
    private String[] arraysString;


    public Sack(String[] arraysString) {
        this.arraysString = arraysString;
    }

    public void print() {
        for (int i = 0; i < arraysString.length; i++) {
            System.out.println(arraysString[i]);
        }
    }
    @Override
    public void add(String str) {
        int newSize = this.size() + 1;
        String[] tempArraysString = arraysString;
        this.arraysString =  new String[newSize];
        for (int i = 0; i < tempArraysString.length; i++) {
            this.arraysString[i] = tempArraysString[i];
        }
        this.arraysString[newSize - 1] = str;
    }

    @Override
    public String get(int index) {
        return arraysString[index];
    }

    @Override
    public String[] getList() {
        return this.arraysString;
    }

    @Override
    public int size() {
        return this.arraysString.length;
    }

    @Override
    public void removeLast() {
        int newSize = this.size() - 1;
        String[] tempArraysString = arraysString;
        this.arraysString =  new String[newSize];
        for (int i = 0; i < tempArraysString.length - 1; i++) {
            this.arraysString[i] = tempArraysString[i];
        }
    }

    @Override
    public void removeByIndex(int index) {
        if ((index >= this.size())||(index < 0)){
            System.out.println("Index out of range");
        } else {
            int newSize = this.size() - 1;
            String[] tempArraysString = arraysString;
            this.arraysString = new String[newSize];
            int currentIndex = 0;
            for (int i = 0; i < tempArraysString.length; i++) {
                if (i != index) {
                    this.arraysString[currentIndex] = tempArraysString[i];
                    currentIndex++;
                }

            }
        }
    }
}
