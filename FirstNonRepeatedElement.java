package com.DSAproblems.arrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstNonRepeatedElement
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);

        int firstNonRepeated = findFirstNonRepeated(list);

        System.out.println("Original List: " + list);
        System.out.println("First Non-Repeated Element: " + (firstNonRepeated == -1 ? "None" : firstNonRepeated));
    }

    public static int findFirstNonRepeated(ArrayList<Integer> list)
    {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list)
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : list)
        {
            if (frequencyMap.get(num) == 1)
            {
                return num;
            }
        }

        return -1;
    }
}