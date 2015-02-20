/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.


*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class MergeSortedLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode tail = sentinel;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next = l1;
                l1=l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail=tail.next;
        }
        while(l1!=null){
            tail.next=l1;
            tail=tail.next;
            l1=l1.next;
        }
        while(l2!=null){
            tail.next = l2;
            tail = tail.next;
            l2=l2.next;
        }
        
        return sentinel.next;
        
    }
    
}
