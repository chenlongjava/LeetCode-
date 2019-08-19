package com.test;

public class Solution220 {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int m1=Math.abs(nums[i]-nums[j]);
                int m2=Math.abs(i-j);
                System.out.println(m1+"+"+m2);
                if(m1==t&&m2==k)
                    return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int []nums={1,0,1,1};
        int k=1;
        int t=2;

        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
    }

}
