package com.test;


public class Solution2 {


    public static ListNode reverseList(ListNode head)
    {
        if(null==head||head.next==null)
            return head;
        ListNode p=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }

    public static int ChangetoNumber (ListNode head) {
        int i=0;
        int sum=0;
       while(head!=null)
       {
           sum=sum+(int) (head.val*Math.pow(10,i));
           i++;
           head=head.next;
       }
       return sum;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node=new ListNode(-1);
        ListNode cur=node;
        int a1=ChangetoNumber(l1);
        int a2=ChangetoNumber(l2);
        int sum=a1+a2;
        int len=String.valueOf(sum).length()-1;
        int len1=len;
        for(int i=0;i<=len;i++)
        {
           // System.out.print((int)(sum/Math.pow(10,len1--))%10+" ");
           cur.next=new ListNode((int)(sum/Math.pow(10,len1--))%10);
           cur=cur.next;

        }
//        while(i<c.length)
//        {
//            cur.next=new ListNode((int)c[i++]);
//            cur=cur.next;
//        }

        return reverseList(node.next);
    }

    public static void main(String[] args) {
        ListNode nodeA1=new ListNode(9);


        ListNode nodeB1=new ListNode(1);
        ListNode nodeB2=new ListNode(9);
        ListNode nodeB3=new ListNode(9);
        ListNode nodeB4=new ListNode(9);
        ListNode nodeB5=new ListNode(9);
        ListNode nodeB6=new ListNode(9);
        ListNode nodeB7=new ListNode(9);
        ListNode nodeB8=new ListNode(9);
        ListNode nodeB9=new ListNode(9);


        nodeB1.next=nodeB2;
        nodeB2.next=nodeB3;
        nodeB3.next=nodeB4;
        nodeB4.next=nodeB5;
        nodeB5.next=nodeB6;
        nodeB6.next=nodeB7;
        nodeB7.next=nodeB8;
        nodeB8.next=nodeB9;






        ListNode head=addTwoNumbers(nodeA1,nodeB1);
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }

    }
}
