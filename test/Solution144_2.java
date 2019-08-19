package com.test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * 非递归遍历
 *
 */

public class Solution144_2 {


    public  List<Integer> preorderTraversal(TreeNode root) {


     LinkedList<TreeNode> stack=new LinkedList<>();
     LinkedList<Integer>   res=new LinkedList<>();
     if(root == null) return res;
     stack.add(root);
     while(!stack.isEmpty())
     {
         TreeNode node=stack.pollLast();
         res.add(node.val);

         if(node.right!=null)
         {
             stack.add(node.right);
         }
         if(node.left!=null)
         {
             stack.add(node.left);
         }
     }
       return res;
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
