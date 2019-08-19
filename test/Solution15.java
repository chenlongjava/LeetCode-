package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public static List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      int len =nums.length;
      if(nums.length<3||nums==null) return ans;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]>0) break;
          if(i>0&&nums[i]==nums[i-1]) continue;
          int L=i+1;
          int R=len-1;

          while(L<R)
          {
              int sum=nums[i]+nums[R]+nums[L];
              if(sum==0)
              {
                  ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                  while(L<R && nums[L]==nums[L+1])L++;
                  while(L<R && nums[R]==nums[R-1])R--;
                  L++;
                  R++;
              }else if(sum<0)L++;
               else if(sum>0)R--;

          }

      }

      return ans;
    }

    public static void main(String[] args) {
       int num[]={-1,0,1,2,-1,4};
       List list=threeSum(num);

       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
    }
}
