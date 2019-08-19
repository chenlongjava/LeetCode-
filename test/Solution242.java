package com.test;

import java.util.Arrays;


public class Solution242 {

    public static boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()&&s!=null)
           return false;
       char []c=s.toCharArray();
       char []c1=s.toCharArray();

       Arrays.sort(c);
       Arrays.sort(c1);


       return Arrays.equals(c,c1);
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
