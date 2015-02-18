/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
package leetcode;

/**
 *
 * @author Pratik
 */
public class IsBalanced {
    
     public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        if(getHeight(root)==-1)
            return false;
        return true;
        
    }
    
    private int getHeight(TreeNode root){
        if(root==null)
            return 0;
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if(left == -1 || right == -1)
            return -1;
            
        if(Math.abs(left-right)> 1)
            return -1;
        
        return Math.max(left,right) + 1;
    }
    
}
