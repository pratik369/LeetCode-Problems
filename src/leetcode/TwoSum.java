/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*


Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pratik
 */
public class TwoSum {
    
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null)
            throw new NullPointerException();
            
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int j=0;j<=numbers.length;j++){
            if(map.containsKey(target-numbers[j])){
                int ret[] = new int[2];
                ret[0] = map.get(target-numbers[j]);
                ret[1] = j+1;
                return ret;
            }
            map.put(numbers[j],j+1);
        }
        return null;
    }
    
}
