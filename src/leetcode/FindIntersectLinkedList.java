/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/*
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class FindIntersectLinkedList {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null && headB == null)
            return null;
        int lenA = getLen(headA);
        int lenB = getLen(headB);
        
        if(lenA>lenB){
            while(lenA>lenB){
                headA=headA.next;
                lenA--;
            }
        }else{
            while(lenB>lenA){
                headB=headB.next;
                lenB--;
            }
        }
        
        while(headA!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
        
        
    }
    public int getLen(ListNode node){
        int count = 0;
        while(node!=null){
            node=node.next;
            count++;
        }
        return count;
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
       val = x;
       next = null;
      }
  }
