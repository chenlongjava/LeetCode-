package com.test;

public class Solution75 {

    public static void sortColors(int[] nums) {
        int[] sorted = new int[3];

        for(int i=0; i<nums.length; i++){
            sorted[nums[i]]++;
        }

        int index=0;
        for(int i=0;i<sorted[0];i++)
        {
            sorted[index++]=0;
        }
        for(int i=0;i<sorted[1];i++)
        {
            sorted[index++]=0;
        }
        for(int i=0;i<sorted[2];i++)
        {
            sorted[index++]=0;
        }

    }

    public static void main(String[] args)
    {
        int a[]={0,0,0,1,1,2,2,2};
          sortColors(a);
    }
}
