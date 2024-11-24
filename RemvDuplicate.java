package com.DSAproblems.arrayList;

import java.util.Arrays;

public class RemvDuplicate
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,2,3,4,2};
        System.out.println("After removing duplicates array are: ");
        remvDuplicates(arr);
    }
    public static void remvDuplicates(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] == arr[j])
                {
                    for(int k=j;k<n-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        int[] uniqueArray=Arrays.copyOf(arr,n);
        System.out.println(Arrays.toString(uniqueArray));
    }
}