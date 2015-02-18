/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class MaxDepthTree {
    public int maxDepth(TreeNode root) {
        return root==null? 0 : 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
