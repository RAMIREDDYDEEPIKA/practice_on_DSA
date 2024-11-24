package com.DSAproblems.arrayList;

import java.util.ArrayList;

public class SortArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

        sortList(list);

        System.out.println("Sorted List: " + list);
    }

    public static void sortList(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j))
                {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}