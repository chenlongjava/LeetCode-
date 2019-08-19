package com.test;

public class Solution24 {

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return next;
    }



    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);



        ListNode head=swapPairs(node1);

        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
