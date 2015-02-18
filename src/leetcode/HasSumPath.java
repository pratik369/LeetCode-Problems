/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.LinkedList;

/**
 *
 * @author Pratik
 */
public class HasSumPath {
    public boolean hasPathSum(TreeNode root, int sum) {
       /* if(root==null)
            return false;
        else if(root.left==null && root.right==null)
            return sum==root.val;
        else 
            return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        */
        
        if(root==null)
            return false;
            
        LinkedList<TreeNode> node = new LinkedList<>();
        LinkedList<Integer> val = new LinkedList<>();
        
        node.push(root);
        val.push(root.val);
        
        while(!node.isEmpty()){
            TreeNode temp = node.poll();
            int tempint = val.poll();
            
            if(temp.left==null && temp.right==null && sum==tempint)
                return true;
                
            if(temp.left!=null){
                node.push(temp.left);
                val.push(tempint+temp.left.val);
            }
            
            if(temp.right!= null){
                node.push(temp.right);
                val.push(tempint+temp.right.val);
            }
    
        }
        
        return false;
    }
    
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
