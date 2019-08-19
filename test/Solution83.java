package com.test;


public class Solution83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;

        while (cur!=null&&cur.next!=null)
        {
            if(cur.val==cur.next.val)
            {
                cur.next=cur.next.next;
            }else
            {
                cur=cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(3);

        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        deleteDuplicates(listNode);

        ListNode head=listNode;
        while(!(head==null))
        {
            System.out.print(head.val+" ");

            head=head.next;
        }
    }
}
