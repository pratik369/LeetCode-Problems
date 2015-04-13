/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
*/
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class Sum4Sum {
    public List<List<Integer>> fourSum(int[] num, int target) {
        if(num == null)
            throw new NullPointerException();
        
        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
        
        if(num.length < 4)
            return quadruplets;
        
        Arrays.sort(num);
        
        int a = 0;
        while(a<num.length -3){
            int b = a + 1;
                
                while(b<num.length -2){
                    int c = b + 1;  
                    int d = num.length - 1;
                    
                    while(c < d){
                        int sum = num[a] + num[b] + num[c] + num[d];
                        if(sum == target){
                            List<Integer> quadruplet = new ArrayList<Integer>();
                            quadruplet.add(num[a]);
                            quadruplet.add(num[b]);
                            quadruplet.add(num[c]);
                            quadruplet.add(num[d]);
                            quadruplets.add(quadruplet);
                            
                            for(c = c+ 1; num[c] == num[c-1] && c<d ; c++);
                            for(d = d- 1; num[d] == num[d+1] && c<d; d--);
                        } else if(sum < target) {
                            for(c = c+ 1; num[c] == num[c-1] && c<d ; c++);
                        }else 
                            for(d = d- 1; num[d] == num[d+1] && c<d; d--);
                    }
                    
                    for(b = b + 1; num[b] == num[b-1] && b < num.length - 2; b++);
                }
                
                for(a = a + 1; num[a] == num[a-1] && a < num.length - 3; a++);
        }
        
        return quadruplets;
    }
    
}
