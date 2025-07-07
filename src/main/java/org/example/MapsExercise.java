package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Yuliia", 123456);
        map.put("Hermann", 9876543);
        map.put("Jorn", 12390887);
        map.put("Hanna", 98762341);

        System.out.println("Herman hat die Telefonnimmer " + map.get("Hermann"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.remove("Yuliia");

        System.out.println("Die Liste, nachdem Yullia gelöscht wurde, enthält folgende Einträge:");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("Aktuell erhält das Map " + map.size() + " Elementen");
        map.clear();
        System.out.println("Ich habe alles gelöscht " + map.size());
        //Probiere Methoden wie remove(), size() und clear() aus.
    }
}
