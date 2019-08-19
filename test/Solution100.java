package com.test;

public class Solution100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p == null && q == null) return true;
       if(p == null || q == null) return false;

       if(p.val!=q.val) return false;

       return isSameTree(q.left,p.left)&&isSameTree(q.right,q.right);
    }
}
