package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution26 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }

        for(int s=0;s<nums.length;s++)
        {
            System.out.println(nums[s]);
        }
        return i+1;

    }

    public static void main(String[] args) {
        int a[]={1,1,2};
        System.out.println(removeDuplicates(a));

    }
}
