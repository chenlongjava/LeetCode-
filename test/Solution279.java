package com.test;

public class Solution279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1]; // 默认初始化值都为0
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 最坏的情况就是每次+1
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                // System.out.println(i-j*j);
                // 动态转移方程
            }
        }

        return dp[n];
    }


    public static void main(String[] args) {
        int a=12;
        int i=new Solution279().numSquares(a);
        System.out.println(i);
    }
}
