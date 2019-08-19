package com.test;

public class Solution21 {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if(l1==null)
    {
        return l2;
    }else if(l2==null){
        return l1;
    }
    else if(l1.val<l2.val)
    {
        l1.next=mergeTwoLists(l1.next,l2);
        return l1;
    }
    else {
        l2.next=mergeTwoLists(l1,l2.next);
        return l2;
    }
    }


    public static void main(String[] args) {
        ListNode nodeA1=new ListNode(1);
        ListNode nodeA2=new ListNode(2);
        ListNode nodeA3=new ListNode(4);

        nodeA1.next=nodeA2;
        nodeA2.next=nodeA3;

        ListNode nodeB1=new ListNode(1);
        ListNode nodeB2=new ListNode(3);
        ListNode nodeB3=new ListNode(4);
        nodeB1.next=nodeB2;
        nodeB2.next=nodeB3;

        ListNode head=mergeTwoLists(nodeA1,nodeB1);

        while(!(head==null))
        {
            System.out.print(head.val+" ");

            head=head.next;
        }
    }
}
