/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class PlusOne {
    
    public int[] plusOne(int[] digits) {
        if(digits==null)
            throw new NullPointerException();
        int carry = 1;
        int res[] = new int[digits.length];
        
        for(int i = digits.length -1;i>=0;i--){
            int val = digits[i] + carry;
            res[i] = val%10;
            carry = val/10;
        }
        
        if(carry==1){
            res = new int[digits.length + 1];
            res[0] = carry;
        }
        
        return res;
    }
    
}
