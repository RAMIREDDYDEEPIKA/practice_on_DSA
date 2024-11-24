package com.DSAproblems.arrayList;

import java.util.ArrayList;

public class RotateArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;
        ArrayList<Integer> rotatedList = rotateList(list, k);

        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotatedList);
    }

    public static ArrayList<Integer> rotateList(ArrayList<Integer> list, int k)
    {
        ArrayList<Integer> result = new ArrayList<>(list.size());
        int size = list.size();
        k = k % size;

        for (int i = 0; i < size; i++)
        {
            result.add(list.get((size - k + i) % size));
        }
        return result;
    }
}