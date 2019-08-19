package com.test;

import java.util.*;

public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(Integer i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> []list=new List[nums.length-1];

        for(int key:map.keySet())
        {
            int i=map.get(key);
            if(list[i]==null)
                list[i]=new ArrayList();
            list[i].add(key);
        }
        for(int i=list.length-1;i>=0 && res.size()<k;i--){
            if(list[i]==null) continue;
            res.addAll(list[i]);
        }
        return res;
    }




    public static void main(String[] args) {
        int []nums={1,1,1,2,2,3};
        List<Integer> list=new Solution347().topKFrequent(nums,2);

        for(Integer s:list)
        {
            System.out.println(s);
        }
    }
}
