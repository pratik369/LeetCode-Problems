/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
*/
package leetcode;

import java.util.Stack;

/**
 *
 * @author Pratik
 */
public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;
        while(temp != null || !stack.isEmpty()){
            if(temp.right!=null)
                stack.push(temp.right);
            if(temp.left != null) {
                temp.right = temp.left;
                temp.left = null;
            } else if(!stack.isEmpty()){
                TreeNode temp1 = stack.pop();
                temp.right = temp1;
            }
            temp = temp.right;
        }
    }
    
}
