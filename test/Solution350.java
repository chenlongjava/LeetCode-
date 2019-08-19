package com.test;

import java.util.*;

public class Solution350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int a : nums1) {
            list1.add(a);
        }
        int a[] = new int[list1.size()];
        int temp = -1;
        for (int i = 0; i < nums2.length; i++) {
            if (list1.contains(nums2[i])) {
                temp++;
                a[temp] = nums2[i];
                Integer x = nums2[i];
                list1.remove(x);
            }
        }
        return Arrays.copyOf(a, temp + 1);


    }

    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        int a[]=intersect(nums1, nums2);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
