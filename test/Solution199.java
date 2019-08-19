package com.test;


import java.util.ArrayList;
import java.util.List;


public class Solution199 {


    List<Integer> list=new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
         if(root==null)
             return list;
            list.add(root.val);
         if(root.right!=null)
         {

             rightSideView(root.right);
         }else{
             rightSideView(root.left);
         }

         return list;
    }





    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);


        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;

        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;

        treeNode3.left=treeNode4;
        treeNode3.right=null;

        treeNode4.left=null;
        treeNode4.right=null;




        List<Integer> list=new Solution199().rightSideView(treeNode1);



        for(Integer s:list)
        {
            System.out.print(s+" ");
        }

    }
}
