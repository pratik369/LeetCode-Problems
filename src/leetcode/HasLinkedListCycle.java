/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class HasLinkedListCycle {
     public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)  
                return true;
        }
        
        return false;
    }
    
}
