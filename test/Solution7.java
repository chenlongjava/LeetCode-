package com.test;

public class Solution7 {

    public int reverse(int x) {
        if(x>0)
        {
            StringBuffer stringBuffer=new StringBuffer(x);
            int len=stringBuffer.length();
            char []c=new char[len];
            int index=0;
            for(int i=len-1;i>=0;i--)
            {
                c[index]=stringBuffer.charAt(len);
                index++;
            }
            String s=String.valueOf(c);
            System.out.println(s);
            int value =Integer.parseInt(s);
            return value;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution7 solution7=new Solution7();
        int num=123;
        solution7.reverse(num);
    }
}
