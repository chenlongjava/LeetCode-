package com.test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Solution102 {


    List<List<Integer>> levels=new ArrayList<>();

    public void DSF(TreeNode node,int level)
    {
        if(levels.size()==level)
            levels.add(new ArrayList<Integer>());

        levels.get(level).add(node.val);

        if(node.left != null)
            DSF(node.left,level+1);

        if(node.left != null)
            DSF(node.right,level+1);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
       if(root==null) return levels;
       DSF(root,0);
       return levels;
    }





    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(3);
        TreeNode treeNode2=new TreeNode(9);
        TreeNode treeNode3=new TreeNode(20);
        TreeNode treeNode4=new TreeNode(15);
        TreeNode treeNode5=new TreeNode(7);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;

        treeNode2.left=null;
        treeNode2.right=null;

        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;

        treeNode4.left=null;
        treeNode4.right=null;

        treeNode5.left=null;
        treeNode5.right=null;


        List<List<Integer>> list=new Solution102().levelOrder(treeNode1);

        System.out.println(list.size());

        for(List<Integer> s:list)
        {
            System.out.println(s+" ");
        }

    }
}
