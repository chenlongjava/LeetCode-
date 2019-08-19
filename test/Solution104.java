package com.test;

import java.util.Map;

public class Solution104 {


    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
        {
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }

    public static void main(String[] args) {

    }
}
