package com.DSAproblems.linearSearch;

public class CharCount
{
    public static void main(String[] args)
    {
        String word="Hahahha";
        char inputChar='a';
        int result=findCount(word,inputChar);
        if(result!=-1){
            System.out.println(inputChar+" occurs "+result+" times");
        }
    }
    public static int findCount(String word,char inputChar){
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==inputChar)
            {
                count++;
            }
        }
        return count;
    }
}