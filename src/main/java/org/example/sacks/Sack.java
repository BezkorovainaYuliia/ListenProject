package org.example.sacks;

public class Sack implements SackList {
    private Object[] arraysObjects;

    public Sack(Object[] arraysObjects) {
        this.arraysObjects = arraysObjects;
    }

    public void print() {
        if (arraysObjects.length == 0) {
            System.out.println("No objects in this Sack");
            return;
        }
        for (Object arraysObject : arraysObjects) {
            System.out.println(arraysObject);
        }
    }

    @Override
    public void add(Object object) {
        int newSize = this.size() + 1;
        Object[] tempArraysString = arraysObjects;
        this.arraysObjects = new Object[newSize];
        System.arraycopy(tempArraysString, 0, this.arraysObjects, 0, tempArraysString.length);
        this.arraysObjects[newSize - 1] = object;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= this.size() - 1) {
            System.out.println("Index out of bounds");
            return null;
        }
        return arraysObjects[index];
    }

    @Override
    public int size() {
        if (arraysObjects == null) {
            System.out.println("Arrays object is null");
            return 0;
        }
        return this.arraysObjects.length;
    }

    @Override
    public Object removeLast() {
        if (size() < 1) {
            arraysObjects = null;
            return null;
        }

        int newSize = this.size() - 1;
        Object[] tempArraysObjects = arraysObjects;
        this.arraysObjects = new Object[newSize];

        if (tempArraysObjects.length - 1 >= 0)
            System.arraycopy(tempArraysObjects, 0, this.arraysObjects, 0, tempArraysObjects.length - 1);
        return tempArraysObjects[newSize];
    }

    @Override
    public Object removeByIndex(int index) {
        if ((index >= this.size()) || (index < 0)) {
            System.out.println("Index out of range");
            return null;
        }

        int newSize = this.size() - 1;
        Object[] tempArraysString = arraysObjects;
        this.arraysObjects = new Object[newSize];
        int currentIndex = 0;
        for (int i = 0; i < tempArraysString.length; i++) {
            if (i != index) {
                this.arraysObjects[currentIndex] = tempArraysString[i];
                currentIndex++;
            }
        }
        return tempArraysString[index];
    }
}
