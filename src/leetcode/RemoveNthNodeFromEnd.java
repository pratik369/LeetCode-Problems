/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n<=0)
            throw new IllegalArgumentException();
        if(head==null)
            throw new NullPointerException();
        
        ListNode slow = head;
        ListNode fast = head;
        while(n-->0)
            fast=fast.next;
        if(fast==null)
            return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        
        return head;
    }
    
}
