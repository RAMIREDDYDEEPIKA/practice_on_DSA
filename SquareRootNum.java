package com.DSAproblems.binarySearch;

public class SquareRootNum
{
    public static void main(String[] args)
    {
        int number=25;
        System.out.println("square root of a number : "+findSquareNum(number));
    }
    public static int findSquareNum(int number)
    {
        int low=0,high=number;
        int result=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int square=mid*mid;
            if(square==number)
            {
                return mid;
            }
            if(square<number)
            {
                low=mid+1;
                result=mid;
            }
            if(square>number)
            {
                high=mid-1;
            }
        }
        return result;
    }
}