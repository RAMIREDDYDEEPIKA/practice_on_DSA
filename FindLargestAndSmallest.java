package com.DSAproblems.arrayList;

import java.util.ArrayList;

public class FindLargestAndSmallest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

        int largest = findLargest(list);
        int smallest = findSmallest(list);

        System.out.println("Original List: " + list);
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }

    public static int findLargest(ArrayList<Integer> list)
    {
        int largest = list.get(0);
        for (int num : list)
        {
            if (num > largest)
            {
                largest = num;
            }
        }
        return largest;
    }

    public static int findSmallest(ArrayList<Integer> list)
    {
        int smallest = list.get(0);
        for (int num : list)
        {
            if (num < smallest)
            {
                smallest = num;
            }
        }
        return smallest;
    }
}