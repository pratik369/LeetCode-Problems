/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class LevelOrderTraversal {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
            
        List<TreeNode> curLevel = new ArrayList<TreeNode>();
        curLevel.add(root);
        
        while(!curLevel.isEmpty()){
            List<Integer> ints = new ArrayList<Integer>();
            res.add(ints);
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            
            for(TreeNode node : curLevel){
                if(node.left!=null)
                    nextLevel.add(node.left);
                if(node.right!=null)
                    nextLevel.add(node.right);
                ints.add(node.val);
                
            }
            curLevel=nextLevel;
        }
        return res;
    }
    
}
