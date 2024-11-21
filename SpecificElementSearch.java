package com.DSAproblems.linearSearch;

public class SpecificElementSearch
{
    public static void main(String[] args)
    {
        int[] arr={1,4,2,6,8,3};
        int target=8;
        int result=search(arr,target);
        if(result!=-1){
            System.out.println("Element found at index of "+result);
        }
        else{
            System.out.println(result+" :Element not found ");
        }
    }
    public static int search(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
