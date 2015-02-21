/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

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
public class TreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root== null)
            return res;
            
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;
        while(true){
            if(temp==null){
                if(stack.isEmpty())
                    break;
                else{
                    temp = stack.pop();
                    res.add(temp.val);
                    temp = temp.right;
                }
            }else{
                stack.push(temp);
                temp=temp.left;
            }
        }
        return res;
    }
    
}
