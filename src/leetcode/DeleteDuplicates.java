/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class DeleteDuplicates {
     public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode curNode = head;
        
        while(curNode.next!=null){
            if(curNode.val==curNode.next.val)
                curNode.next = curNode.next.next;
            else
                curNode=curNode.next;
        }
        return head;
    }

    
}
 