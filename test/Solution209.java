package com.test;

public class Solution209 {

    public static int minSubArrayLen(int s, int[] nums) {
       int n=nums.length;
       int left=0;
       int rigth=0;
       int sum=0;
       int result=n;
       while(rigth<n)
       {
           if(sum+nums[rigth]<s)
           {
               sum+=nums[rigth++];
           }else
           {
               result=Math.min(result,rigth-left+1);
               sum-=nums[left++];
           }
       }

       if(result==nums.length+1)
           return 0;

       return result;
    }

    public static void main(String[] args) {

        int s=7;
        int nums[]={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
}
