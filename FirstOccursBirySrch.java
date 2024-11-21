package com.DSAproblems.binarySearch;

public class FirstOccursBirySrch
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,3,4,5,6,7,7,8,8,8};
        int target=3;
        firstOccurs(arr,target);
    }
    public static void firstOccurs(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        int occurs=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                occurs=mid;
                right=mid-1;
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
        if(occurs!=-1)
        {
            System.out.println(target+" found at index of "+occurs);
        }
        else
        {
            System.out.println(target+" not found in array");
        }
    }
}