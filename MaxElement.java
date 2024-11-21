package com.DSAproblems.linearSearch;

public class MaxElement
{
    public static void main(String[] args)
    {
        int[] arr={1,3,2,4,5,9,8};
        int max=arr[0];
        MaxNumber(arr,max);
    }
    public static void MaxNumber(int[] arr,int max){
        for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
        }
        System.out.println("Maximum element in the array : "+max);
    }
}
