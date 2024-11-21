package com.DSAproblems.linearSearch;

public class FirstOccurs
{
    public static void main(String[] args)
    {
        int[] arr={1,3,2,4,2,5,1};
        int occurenceValue=8;
        int result=firstOccurs(arr,occurenceValue);
        if(result!=-1){
            System.out.println(occurenceValue+" First occurs at index of "+result);
        }
        else {
            System.out.println(result+" :element is not present in the array");
        }
    }
    public static int firstOccurs(int[] arr,int occurenceValue){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==occurenceValue){
                return i;
            }
        }
        return -1;
    }
}
