package com.test;

public class Solution283 {


    public void moveZeroes(int[] nums) {

     int k=0;

     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]!=0)
         {
             nums[k++]=nums[i];
         }

     }

     for(int i=k;i<nums.length;i++)
     {
         nums[i]=0;
     }


    }



    public static void main(String[] args) {
       int a[]={0,1,0,3,12};

       Solution283 solution283=new Solution283();

    solution283.moveZeroes(a);



    }
}
