/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class RemoveDuplicateElementsSortedList {
    public int removeDuplicates(int[] A) {
        int count = 0;  
        for (int i=1; i<A.length; i++) {  
            if (A[i] == A[i-1]) { // skip duplicates  
                count++;  
            } else { // copy over non-duplicates  
                A[i-count] = A[i];  
            }  
     }  
        return A.length - count;  
    }
}
