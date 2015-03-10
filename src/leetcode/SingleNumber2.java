/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class SingleNumber2 {
    public int singleNumber(int[] A) {
        if(A==null)
            throw new NullPointerException();
        if(A.length == 0)
            throw new IllegalArgumentException();
        if(A.length == 1)
            return A[0];
        
        int res = 0;
        for(int i = 0; i<Integer.SIZE;i++){
            if(solveBit(A,i)==1)
                res = setBit(res,i);
        }
        
        return res;
    }
    
    private int solveBit(int A[], int bit){
        int sum = 0;
        for(int i = 0; i<A.length;i++)
            sum += getBit(A[i],bit);
        
        
        return (sum % 3 == 0) ? 0 : 1;
        
    }
    
    private int setBit(int res, int bit){
        return res  | (1<<bit);
    }
    
    private int getBit(int num, int bit){
        return (num & (1<<bit)) == 0 ? 0 : 1;
    }
    
}
