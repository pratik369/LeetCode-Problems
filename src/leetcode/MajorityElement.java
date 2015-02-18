/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class MajorityElement {
    public int majorityElement(int[] num) {
        if(num==null)
            throw new NullPointerException();
        if(num.length==1)
            return num[0];
        
        int index=0;
        int count=1;
        
        for(int i=1;i<=num.length-1;i++){
            if(num[index]==num[i])
                count++;
            else{
                count--;
            }
            if(count == 0){
                index=i;
                count=1;
            }
        }
        return num[index];
        
    }
    
}
