/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
*/
package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Pratik
 */
public class ReOrderList {
    public void reorderList(ListNode head) {
        Queue<ListNode> queue = new LinkedList<ListNode>();
        Stack<ListNode> stack = new Stack<ListNode>();
        
        for( ListNode current = head; current != null ; current = current.next){
            queue.add(current);
            stack.push(current);
        }
        
        int nodesLinked = 0;
        int totalNodes = stack.size();
        ListNode sentinel = new ListNode(0);
        ListNode tail = sentinel;
        
        while(nodesLinked < totalNodes - 1){
            tail.next = queue.poll();
            tail = tail.next;
            tail.next = stack.pop();
            tail = tail.next;
            nodesLinked += 2;
        }
        
        if(nodesLinked < totalNodes){
            tail.next = queue.poll();
            tail = tail.next;
        }
        tail.next = null;
        
    }
}
