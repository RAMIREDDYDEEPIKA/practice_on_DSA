package com.DSAproblems.linearSearch;

public class AllOccurence
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,5,4,6,2,7,1};
        int inputData=1;
        printAllOccurence(arr,inputData);
    }
    public static void printAllOccurence(int[] arr,int inputData) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputData) {
                System.out.println(inputData+" occurs at indices of : "+i);
            }
        }
    }
}

