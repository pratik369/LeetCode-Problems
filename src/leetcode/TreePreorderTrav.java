/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Pratik
 */
public class TreePreorderTrav {
    public List<Integer> preorderTraversal(TreeNode root) {
        
       /* List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
        */
        
        List<Integer> res = new ArrayList<Integer>();
        if(root==null)
            return res;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.val);
            
            if(temp.right!=null)
                stack.push(temp.right);
            if(temp.left!=null)
                stack.push(temp.left);
        }
        return res;
    }
    
}
