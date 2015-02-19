package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.


*/
/**
 *
 * @author Pratik
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isMirror(root.left,root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right){
        if(left==null || right == null)
            return left==null && right==null;
        return left.val == right.val && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}
