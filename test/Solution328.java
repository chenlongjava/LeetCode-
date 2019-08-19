package com.test;


public class Solution328 {
    public static ListNode oddEvenList(ListNode head) {
        ListNode before_head=new ListNode(-1);
        ListNode before=before_head;
        ListNode after_head=new ListNode(-1);
        ListNode after=after_head;

        while(head!=null)
        {
            if(head!=null)
            {
                before.next=head;
                before=before.next;
                head=head.next;
            }
            if(head!=null)
            {
                after.next=head;
                after=after.next;
                head=head.next;
            }
        }
        after.next=null;
        before.next=after_head.next;
        return before_head.next;
    }
    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(3);
        ListNode listNode3=new ListNode(4);
        ListNode listNode4=new ListNode(5);
        ListNode listNode5=new ListNode(6);

        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;

        oddEvenList(listNode);

        ListNode head=listNode;
        while(!(head==null))
        {
            System.out.print(head.val+" ");

            head=head.next;
        }
    }
}
