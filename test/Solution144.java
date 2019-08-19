package com.test;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    @Override
    public String toString() {
        return "TreeNode [val=" + val + ", left=" + left + ", right=" + right
                + "]";
    }
 }

public class Solution144 {


    public  List<Integer> preorderTraversal(TreeNode root) {
       List res=new ArrayList();
       DFS(root,res);
       return res;
    }
    private  void DFS(TreeNode root, List<Integer> res) {
       if(root==null)
           return;

       DFS(root.left,res);

       DFS(root.right,res);

        res.add(root.val);
    }



    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);

        treeNode1.left=null;
        treeNode1.right=treeNode2;
        treeNode2.left=treeNode3;
        treeNode2.right=null;
        treeNode3.left=null;
        treeNode3.right=null;

        List<Integer> list=new Solution144().preorderTraversal(treeNode1);

        System.out.println(list.size());

        for(Integer s:list)
        {
            System.out.print(s+" ");
        }

    }
}
