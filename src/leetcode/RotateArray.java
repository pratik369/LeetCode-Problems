/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Pratik
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums==null)
            throw new NullPointerException();
        if(k==0 || nums.length == 1 )
            return;
        k%=nums.length; //if K greater than array length
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
        
    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}
