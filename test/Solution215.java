package com.test;

import java.util.Arrays;

public class Solution215 {

    public static int findKthLargest(int[] nums, int k) {
        int max=0;
        Arrays.sort(nums);
        max=nums[nums.length-k];
        return max;
    }


    public static void main(String[] args) {
        int a[]={3,2,1,5,6,4};
        System.out.println(findKthLargest(a,2));
    }
}
