package com.DSAproblems.binarySearch;

public class LastOccursBinrySrch
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,4,5,6,7,8,8,8,9,9};
        int target=2;
        int result=lastOccurence(arr,target);
        if(result!=-1)
        {
            System.out.println(target+" last occurence at "+result);
        }
        else
        {
            System.out.println(target+" not found in array"+result);
        }
    }
    public static int lastOccurence(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        int occurs=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                occurs=mid;
                left=mid+1;
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
        return occurs;
    }
}