package org.example.sacks;

public interface SackList {
    void add(Object object);

    Object get(int index);

    int size();

    Object removeLast();

    Object removeByIndex(int index);
}
