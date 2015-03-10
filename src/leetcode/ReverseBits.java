package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer
*/

/**
 *
 * @author Pratik
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int y = 0;
        for(int i = 0; i<Integer.SIZE;i++){
            y <<= 1;
            y |= n & 1;
            n >>>=1;
        }
        return y;
    }
    
}
