/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num == null)
            throw new NullPointerException();
        if(num.length == 0)
            return null;
        
        return convertToBST(num,0,num.length-1);
        
    }
    
    private TreeNode convertToBST(int[] num, int start, int end){
        if(start>end)
            return null;
        int middle = (start + end)/2;
        TreeNode root = new TreeNode(num[middle]);
        root.left = convertToBST(num,start,middle-1);
        root.right = convertToBST(num,middle+1,end);
        
        return root;
    }
    
}
