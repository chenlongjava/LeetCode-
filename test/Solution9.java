package com.test;

public class Solution9 {
    public boolean isPalindrome(int x) {

        String s=String.valueOf(x);
        char []c=new char[s.length()];
        int index=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            c[index]=s.charAt(i);
            index++;
        }
        String s1=new String(c);
        System.out.println(s1);
        if(s1.equals(s))
        {
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int a=101;
        Solution9 s=new Solution9();
        System.out.println(s.isPalindrome(a));
    }
}
