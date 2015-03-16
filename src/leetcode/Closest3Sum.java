/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
package leetcode;

import java.util.Arrays;

/**
 *
 * @author Pratik
 */
public class Closest3Sum {
    public int threeSumClosest(int[] num, int target) {
        
        if(num == null)
            throw new NullPointerException();
        if(num.length < 3)
            throw new IllegalArgumentException();
        
        Arrays.sort(num);    
        int result = num[0] + num[1] + num[2];
        
        for(int i = 0; i<num.length - 2; i++) {
            
            int left = i + 1;
            int right = num.length - 1;
            
            while(left < right) {
                int threeSum = num[i] + num[left] + num[right];
                if(threeSum == target)
                    return threeSum;
                else if (threeSum<target)
                    left++;
                else
                    right--;
                if(Math.abs(threeSum-target) < Math.abs(result - target))
                    result = threeSum;
            }
            
        }
        
        return result;
        
        
    }
    
}
