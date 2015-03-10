/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class Count1s {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i =0 ;i<Integer.SIZE;i++){
        count += (n&1);
        n >>=1;
        }
        
        return count;
        
    }
}
