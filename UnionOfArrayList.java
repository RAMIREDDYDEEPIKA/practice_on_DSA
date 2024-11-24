package com.DSAproblems.arrayList;

import java.util.ArrayList;

public class UnionOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> union = findUnion(list1, list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Union of ArrayList: " + union);
    }

    public static ArrayList<Integer> findUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        for (Integer element : list2) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}