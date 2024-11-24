package com.DSAproblems.arrayList;

import java.util.ArrayList;

public class CheckPalindrome
{
    public static void main(String[] args)
    {
        ArrayList<Character> list = new ArrayList<>();
        list.add('r');
        list.add('a');
        list.add('c');
        list.add('e');
        list.add('c');
        list.add('a');
        list.add('r');

        boolean isPalindrome = checkPalindrome(list);

        System.out.println("Original List: " + list);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(ArrayList<Character> list)
    {
        int start = 0;
        int end = list.size() - 1;

        while (start < end)
        {
            if (!list.get(start).equals(list.get(end)))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}