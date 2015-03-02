/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;

/**
 *
 * @author Pratik
 */
public class ValidateBST {
    /*public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        if(root.val== Integer.MAX_VALUE || root.val == Integer.MIN_VALUE)
            return true;
        
        return validateBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    private boolean validateBST(TreeNode root, int min, int max){
        if(root==null)
            return true;
        
        if(root.val > min && root.val < max && validateBST(root.left,min,root.val) && validateBST(root.right,root.val,max))
            return true;
            
            return false;
    }*/
  
  
    ArrayList<Integer> arr = new ArrayList<Integer>();
    private void performInorder(TreeNode root) {
        if ( root == null) {
            return;
        }
        performInorder(root.left);
        arr.add(root.val);
        performInorder(root.right);
    }
 
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        performInorder(root);
        int previous = arr.get(0).intValue();
         
        for (int i = 1 ; i < arr.size();i++) {
            int current = arr.get(i).intValue(); 
            if (current <= previous) {
                return false;
            }
            previous = current;
        }
        return true;
    }
}
