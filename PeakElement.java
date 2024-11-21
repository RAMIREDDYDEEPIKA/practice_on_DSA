package com.DSAproblems.binarySearch;

public class PeakElement
{
    public static void main(String[] args)
    {
        int[] arr={1,3,9,10,11,13,2,1};
        bitonicTopElement(arr);
    }
    public static void bitonicTopElement(int[] arr){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                System.out.println("Peek element in array "+arr[mid]+" present at index of "+mid);
                break;
            }
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            if(arr[mid]<arr[mid-1]){
                right=mid-1;
            }
        }
    }
}
