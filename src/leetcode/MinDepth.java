/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/
package leetcode;

import java.util.LinkedList;

/**
 *
 * @author Pratik
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
public class MinDepth {
    public int minDepth(TreeNode root) {
        /*if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 1;
        else if(root.left == null)
            return (minDepth(root.right) + 1);
        else if(root.right == null)
            return (minDepth(root.left) + 1);
        else 
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        */
        
        
        if(root==null)
            return 0;
        LinkedList<TreeNode> node = new LinkedList<TreeNode>();
        LinkedList<Integer> counts = new LinkedList<Integer>();
        
        node.add(root);
        counts.add(1);
        while(!node.isEmpty()){
            TreeNode temp = node.remove();
            int count = counts.remove();
            if(temp.left!=null){
                node.add(temp.left);
                counts.add(count+1);
            }
            if(temp.right!=null){
                node.add(temp.right);
                counts.add(count+1);
            }
            
            if(temp.left==null && temp.right==null)
                return count;
            
        }
        return 0;
    }
    
    
}

