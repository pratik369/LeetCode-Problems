/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.


*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class FactTrailingZeroes {
    public int trailingZeroes(int n) {
        if(n==0 || n==1 || n==2 || n==3 || n==4)
            return 0;
        int count =0;
        for(long i = 5 ; i<=n ; i*=5){
            count+=n/i;
        }
        return count;
        
    }
}
