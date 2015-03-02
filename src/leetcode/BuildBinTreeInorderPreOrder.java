/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class BuildBinTreeInorderPreOrder {
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder == null || preorder == null)
            throw new NullPointerException();
        if(inorder.length != preorder.length)
            throw new IllegalArgumentException();
       return binaryTreeBuilder(inorder,0,preorder,0,preorder.length);
        
    }
    private TreeNode binaryTreeBuilder(int[] inorder, int iStart, int[] preorder, int pStart, int length){
        if(length == 0)
            return null;
        if(length == 1)
            return new TreeNode(preorder[pStart]);
        TreeNode root = new TreeNode(preorder[pStart]);
        
        int leftsize = 0;
        while(inorder[iStart + leftsize] != preorder[pStart])
            leftsize++;
        
        root.left = binaryTreeBuilder(inorder,iStart,preorder,pStart+1,leftsize);
        
        root.right = binaryTreeBuilder(inorder,iStart+1+leftsize, preorder,pStart + 1+ leftsize, length - leftsize - 1);
        
        
            return root;
        
       
    }
    
}
