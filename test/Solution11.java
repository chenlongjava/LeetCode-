package com.test;

import java.util.Arrays;

public class Solution11 {

    public int maxArea(int[] height) {
        int len=height.length-1;
        int max=0;
        for(int i=0;i<=len;i++)
            for(int j=i+1;j<=len;j++)
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));

        return max;
    }



    public static void main(String[] args) {
        int a[]={1,8,6,2,5,4,8,3,7,11,11};

        System.out.println(new Solution11().maxArea(a));

    }
}
