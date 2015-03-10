/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        if(A == null)
            throw new NullPointerException();
        if(A.length == 0)
            throw new IllegalArgumentException();
        
        int x =0;
        
        for(int i= 0; i<A.length;i++)
            x^=A[i];
        
        return x;
        
    }
    
}
