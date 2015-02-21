/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class HasLinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null || fast.next == null)
            return null;
        while(head!=slow){
            slow=slow.next;
            head=head.next;
        }
        return slow;
        
    }
    
}
