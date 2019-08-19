package com.test;

import java.util.Stack;

public class Solution20 {


    public boolean isValid(String s)
    {
        boolean result=true;
        char []c=s.toCharArray();
        Stack<Character>  stack=new Stack();

        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='('||c[i]=='['||c[i]=='{')
                stack.add(c[i]);
            else if(c[i]==')')
                result=result&&!stack.isEmpty()&&'('==stack.pop();
            else if(c[i]==']')
                result=result&&!stack.isEmpty()&&'['==stack.pop();
            else if(c[i]=='}')
                result=result&&!stack.isEmpty()&&'{'==stack.pop();
        }

        result=result&&stack.isEmpty();
        return  result;

    }

    public static void main(String[] args) {
        String s="()";
        System.out.println(new Solution20().isValid(s));
    }
}
