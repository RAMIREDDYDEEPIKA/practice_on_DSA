package com.DSAproblems.binarySearch;

public class RotatedArrayTarget
{
    public static void main(String[] args)
    {
        int[] arr={3,5,7,9,13,16,19,27,29};
        int target=16;
        int result=searchTarget(arr,target);
        if(result!=-1)
        {
            System.out.println("Target found at index "+result);
        }
        else
        {
            System.out.println("Target not found in list");
        }
    }
    public static int searchTarget(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int pivot=start+(end-start)/2;
            if(arr[pivot]==target)
            {
                return pivot;
            }
            if(arr[start]<arr[pivot])
            {
                if(arr[start]<=target && target<arr[pivot])
                {
                    end=pivot-1;
                }
                else
                {
                    start=pivot+1;
                }

            }
            if(arr[start]>arr[pivot])
            {
                if(arr[pivot]<target && target<=arr[end])
                {
                    start=pivot+1;
                }
                else
                {
                    end=pivot-1;
                }
            }
        }
        return -1;
    }
}