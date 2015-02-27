/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a binary tree, find the maximum path sum.

The path may start and end at any node in the tree.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class MaxPathSum {
    private static int maxSum;
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        maxSum = Integer.MIN_VALUE;
        traverse(root);
        return maxSum;
   }
   private int traverse(TreeNode root){
        int left = 0;
        int right = 0;
        if(root.left!=null)
            left=traverse(root.left);
        if(root.right!=null)
            right=traverse(root.right);

        int maxRoot = root.val + Math.max(left,0) + Math.max(right,0);
        maxSum=Math.max(maxSum,maxRoot);
        
        int maxChild = Math.max(left,right);
        return root.val+Math.max(maxChild,0);
   }
    
}
