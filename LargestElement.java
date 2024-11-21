package com.DSAproblems.binarySearch;

public class LargestElement
{
    public static void main(String[] args)
    {
        int[] arr={1,3,5,7,9,11,13,15,16,17};
        int target=7;
        int result=largestNum(arr,target);
        if(result!=-1)
        {
            System.out.println("Largest element of Target is "+result);
        }
        else
        {
            System.out.println("Target element is not found in list");
        }
    }
    public static int largestNum(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                left=mid+1;
                return arr[left];
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