package com.DSAproblems.arrayList;

public class FindDuplicate
{
    public static void main(String[] args)
    {
        int[] arr={1,5,3,2,7,8,9,3,5,2};
        System.out.print("Duplicate elements in array : ");
        findRepeatElement(arr);
    }
    public static void findRepeatElement(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }
    }
}