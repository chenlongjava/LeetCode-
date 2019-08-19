package com.test;


class ListNode{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val=x;
    }
}

public class Solution203 {
//    public ListNode removeElements(ListNode head,int val)
//    {
//        if(head==null) return null;
//        head.next=removeElements(head.next,val);
//        if(head.val==val)
//        {
//            return head.next;
//        }else
//        return head;
//    }

    public static ListNode removeElements(ListNode head, int val) {
       if(head==null)
           return null;
       head.next=removeElements(head.next,val);
       if(head.val==val)
           return head.next;
       else
           return head;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(6);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(5);
        ListNode node7=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;

        ListNode head=removeElements(node1,6);

        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }

    }
}
