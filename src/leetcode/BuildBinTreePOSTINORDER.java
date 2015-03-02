/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class BuildBinTreePOSTINORDER {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null)
            throw new NullPointerException();
        if(inorder.length != postorder.length)
            throw new IllegalArgumentException();
        
        return binaryTreeBuilder(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    
    private TreeNode binaryTreeBuilder(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd){
        if(iStart>iEnd || pStart>pEnd)
            return null;
        
        int rootValue = postorder[pEnd];
        TreeNode root = new TreeNode(rootValue);
        
        int k = 0;
        for(k = 0 ;k<=inorder.length; k++){
            if(inorder[k]==rootValue)
                break;
        }
        root.left = binaryTreeBuilder(inorder,iStart,k-1,postorder,pStart,pStart + k -(iStart+1));
        
        root.right = binaryTreeBuilder(inorder,k+1,iEnd,postorder,pStart+k-iStart,pEnd-1);
        
        return root;
    }
    
}
