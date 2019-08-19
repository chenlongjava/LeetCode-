package com.test;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution82 {


    public static  ListNode deleteDuplicates(ListNode head) {

        if(head==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy.next;

        while(fast != null)
        {
            while(fast.next!=null && fast.val==fast.next.val)
                fast=fast.next;
            if(slow.next==fast)
                slow=slow.next;
            else
                slow.next=fast.next;
            fast=fast.next;
        }


        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode listNode =new ListNode(1);
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(3);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(4);
        ListNode listNode6=new ListNode(5);


        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;

       ListNode head=deleteDuplicates(listNode);

        System.out.println();
        while(head!=null)
        {
            System.out.print(head.val+" ");

            head=head.next;
        }
    }
}
