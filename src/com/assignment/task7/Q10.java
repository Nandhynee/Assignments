package com.assignment.task7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q10 {
    static Map<String, Integer> map = new HashMap<>();

    public static void sortbykey()
    {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("peter", 80);
        map.put("mary", 90);
        map.put("Adam", 80);
        map.put("john", 75);
        map.put("william", 40);
        sortbykey();
    }
}
