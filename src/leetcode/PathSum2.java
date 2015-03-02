   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> curPath = new ArrayList<Integer>();
        pathSumHelper(root,sum,curPath,res);
        return res;
    }
    
    private void pathSumHelper(TreeNode node, int sum, List<Integer> curPath, List<List<Integer>> res){
        if(node == null)
            return;
        else if(node.left == null && node.right == null){
            if(sum==node.val){
                List<Integer> curSol = new ArrayList<Integer>(curPath);
                curSol.add(node.val);
                res.add(curSol);
            }
            
           return;
        }
        
        List<Integer> curTempPath = new ArrayList<Integer>(curPath);
        curTempPath.add(node.val);
        int tempSum = sum-node.val;
        
        pathSumHelper(node.left,tempSum,curTempPath,res);
        pathSumHelper(node.right,tempSum,curTempPath,res);
    }
    
}
