package com.DSAproblems.linearSearch;

public class NonDupliChar
{
    public static void main(String[] args)
    {
        String data="you are cute";
        printNonDupli(data);
    }
    public static void printNonDupli(String data)
    {
        for(int i=0;i<data.length();i++)
        {
            boolean isDuplicate=false;
            for(int j=1;j<data.length();j++)
            {
                if(i != j && data.charAt(i)==data.charAt(j))
                {
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                System.out.println(data.charAt(i));
                break;
            }
        }
    }
}
