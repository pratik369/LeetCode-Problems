/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val);
       
        ListNode mid = findMid(head);
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        return root;
        
    }
    
    private ListNode findMid(ListNode head){
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
}
