package com.DSAproblems.binarySearch;

public class SpecificElementBinrySrch
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=2;
        int result=search(arr,target);
        if(result!=-1)
        {
            System.out.println(target+" found at index of "+result);
        }
        else
        {
            System.out.print(result+" :Element not found");
        }
    }
    public static int search(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}