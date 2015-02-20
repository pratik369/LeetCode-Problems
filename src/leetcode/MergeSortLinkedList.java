/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Pratik
 */
public class MergeSortLinkedList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null)
            return head;
        ListNode headTwo = splitList(head);
        head=sortList(head);
        headTwo=sortList(headTwo);
        
        return merge(head,headTwo);
    }
    
    private ListNode splitList(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode headTwo = slow.next;
        slow.next = null;
        return headTwo;
    }
    
    private ListNode merge(ListNode headOne, ListNode headTwo){
        ListNode sentinel = new ListNode(0);
        ListNode tail = sentinel;
        while(headOne!=null && headTwo != null){
            if(headOne.val<headTwo.val){
                tail.next = headOne;
                tail = tail.next;
                headOne = headOne.next;
            }else{
                tail.next = headTwo;
                tail = tail.next;
                headTwo = headTwo.next;
            }
            
        }
        
        tail.next = headOne == null ? headTwo : headOne;
        return sentinel.next;
    }
}
