/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
*/
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class Sum3Sum {
    public List<List<Integer>> threeSum(int[] num) {
        
       List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(num.length<3)
            return res;
        
        Arrays.sort(num);
        
        for(int i = 0; i<num.length - 2 && num[i] <= 0 ;i++){
            
            if(i>0 && num[i] == num[i-1])
                continue;
            
            int twosum = 0 - num[i];
            int left = i + 1, right = num.length - 1;
            
            while(left<right){
                
                int sum = num[left] + num[right];
                
                if(sum<twosum)
                    left++;
                else if(sum>twosum)
                    right--;
                else {
                    ArrayList<Integer> triplets = new ArrayList<Integer>();
                    triplets.add(num[i]);
                    triplets.add(num[left]);
                    triplets.add(num[right]);
                    res.add(triplets);
                    left++;
                    right--;
                    
                    while(left<right && num[left] == num[left-1])
                        left++;
                    while(left<right && num[right] == num[right+1])
                        right--;
                }
                
            }
        }
        
        return res; 
        
    }
}
