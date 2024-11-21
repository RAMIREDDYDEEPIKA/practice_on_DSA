package com.DSAproblems.binarySearch;

public class SmallestElement
{
    public static void main(String[] args)
    {
        int[] arr={1,3,5,7,9,11,13,15,16,17,18};
        int target=11;
        int result=smallestNum(arr,target);
        if(result!=-1)
        {
            System.out.println("Smaller number of target is "+result);
        }
        else
        {
            System.out.println("target value not found in array");
        }
    }
    public static int smallestNum(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                right=mid-1;
                return arr[right];
            }
            if(arr[mid]<target)
            {
                left=mid+1;
            }
            if(arr[mid]>target)
            {
                right=mid-1;
            }
        }
        return -1;
    }
}