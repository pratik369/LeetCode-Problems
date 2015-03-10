package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
*/


/**
 *
 * @author Pratik
 */
public class RotateList {
        public ListNode rotateRight(ListNode head, int n) {
        if(n<0)
            throw new IllegalArgumentException();
        if(head == null || head.next == null || n == 0)
            return head;
        
        ListNode front = head;
        ListNode back = head;
        int noOfNodes = 0;
        
        while(front.next != null && noOfNodes<n){
            front = front.next;
            noOfNodes++;
        }
        
        if(front.next == null){
            n = n %(noOfNodes + 1);
            if(n==0)
                return head;
            front = head;
            noOfNodes = 0;
            
            while(noOfNodes<n){
                front = front.next;
                noOfNodes++;
            }
        }
        
        while(front.next!=null){
            front = front.next;
            back = back.next;
        }
        
        front.next = head;
        ListNode newHead = back.next;
        back.next = null;
        
        return newHead;
        
    }
    
}

 
