package org.example.sacks;

public interface SackList<T> {
    void add(T object);

    T get(int index);

    int size();

    T removeLast();

    T removeByIndex(int index);
}
