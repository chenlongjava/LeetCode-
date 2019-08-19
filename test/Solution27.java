package com.test;

public class Solution27
{
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int num1:nums)
        {
            if(num1!=val)
            {
                nums[i]=num1;
                i++;
            }
        }

     return i;
    }
    public static void main(String[] args) {
         int a[]={1,2,3,4,5,1,2};
        System.out.println(new Solution27().removeElement(a,1));

    }
}
