package com.DSAproblems.linearSearch;

public class SpecificStringSearch
{
    public static void main(String[] args)
    {
        String[] arr={"usha","Nisha","Asha","esha","Aashu"};
        String target="Esha";
        int result=search(arr,target);
        if(result!=-1){
            System.out.println("String found at index of "+result);
        }
        else{
            System.out.println(result+" :String not found ");
        }
    }
    public static int search(String[] arr,String target){
        for(int i=0;i< arr.length;i++){
            if(arr[i].equalsIgnoreCase(target)){
                return i;
            }
        }
        return -1;
    }
}
