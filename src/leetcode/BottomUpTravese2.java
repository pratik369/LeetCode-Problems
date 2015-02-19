/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/
package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class BottomUpTravese2 {
    
public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        LinkedList<List<TreeNode>> levels = new LinkedList<List<TreeNode>>(); 
        List<TreeNode> curLevel = new ArrayList<TreeNode>();
        
        if(root!=null)
            curLevel.add(root);
        
        while(!curLevel.isEmpty()){
            levels.addFirst(curLevel);
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            
            for(TreeNode node : curLevel){
                if(node.left!=null)
                    nextLevel.add(node.left);
                if(node.right!=null)
                    nextLevel.add(node.right);
            }
            
            curLevel=nextLevel;
        }
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(List<TreeNode> nodes : levels){
            List<Integer> resLevel = new ArrayList<Integer>();
            for(TreeNode node : nodes)
                resLevel.add(node.val);
            res.add(resLevel);
            
        }
        
        return res;
        
    }
}
