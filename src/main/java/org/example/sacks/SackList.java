package org.example.sacks;

public interface SackList {
    void add(String str);
    String get(int index);
    String [] getList();
    int size();
    void removeLast();
    void removeByIndex(int index);
}
