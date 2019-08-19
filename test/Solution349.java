package com.test;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Solution349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int minLen=Math.min(nums1.length,nums2.length);

        int res[]=new int[minLen];

        for(int num:nums1)
        {
            set.add(num);
        }
        int k=0;
        for(int num:nums2)
        {
            if(set.contains(num))
            {
                res[k++]=num;
                set.remove(num);
            }
        }
        return Arrays.copyOf(res,k);
    }

    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};

        System.out.println(intersection(nums1, nums2));
    }

}
