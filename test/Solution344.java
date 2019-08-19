package com.test;

public class Solution344 {

    public static void reverseString(char[] s) {
         int left=0;
         int rigth=s.length-1;

         while(left<rigth)
         {
             char c;
             c=s[left];
             s[left]=s[rigth];
             s[rigth]=c;
             left++;
             rigth--;
         }

         for(int i=0;i<s.length;i++)
         {
             System.out.println(s[i]);
         }
    }

    public static void main(String[] args) {
         char a[]={'h','e','l','l','o'};
         reverseString(a);
    }
}
