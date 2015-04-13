/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class SortColors {
    public void sortColors(int[] A) {
        if(A == null)
            throw new NullPointerException();

        int left = 0;
        int middle = 0;
        int right = A.length - 1;
        
        while(middle<=right){
            if(A[middle] == 0){
                A[left] ^= A[middle];
                A[middle] ^= A[left];
                A[left] ^= A[middle];
                left++;
                middle++;
            } else if(A[middle] == 1){
                middle++;
            } else if(A[middle] == 2){
                if(middle==right)
                    break;
                A[middle] ^= A[right];
                A[right] ^= A[middle];
                A[middle] ^= A[right];
                right--;
            } else{
                throw new IllegalArgumentException();
            }
        }
    }    
}
