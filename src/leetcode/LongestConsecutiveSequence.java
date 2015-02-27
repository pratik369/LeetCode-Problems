/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
*/
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pratik
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        if(num == null)
            throw new NullPointerException();
            
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        
        for(int n : num)
            map.put(n,1);
        
        for(int i : num){
            if(!map.containsKey(i))
                continue;
            int numcon = 0;
            for(int j = i+1; map.containsKey(j); j++)
            {
                numcon += map.get(j);
                map.remove(j);
            }
            map.put(i,map.get(i)+numcon);
            max = Math.max(map.get(i),max);
        }
        return max;
    }
    
}
