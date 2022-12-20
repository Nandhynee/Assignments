package com.assignment.task7;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Map<Character,Integer> countArr= new HashMap<>();
        int count =1;
        for (int i = 0; i < str.length(); i++)
        {
            Character c = str.charAt(i);
            count=1;
            if(countArr.containsKey(c)){
                count=countArr.get(c)+1;
            }
            countArr.put(c,count);
        }
        Iterator<Character> keys=countArr.keySet().iterator();
        while (keys.hasNext()){
            Character c=keys.next();
            System.out.println("Count of character "+c+" is "+countArr.get(c));
        }
    }
}
