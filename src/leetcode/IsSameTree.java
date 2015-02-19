/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
            return p==null && q==null;
        
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
}
