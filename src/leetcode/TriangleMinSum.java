/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class TriangleMinSum {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null)
            throw new NullPointerException();
        if(triangle.size()==0)
            throw new IllegalArgumentException();
            
        List<Integer> minSum = new ArrayList<Integer>(triangle.get(triangle.size()-1));
        
        for(int nextRow = triangle.size()-2; nextRow>=0; nextRow--){
            List<Integer> nextRowValues = triangle.get(nextRow);
            
            for(int i = 0; i<= nextRow; i++)
                minSum.set(i,nextRowValues.get(i) + Math.min(minSum.get(i),minSum.get(i+1)));
        }
        return minSum.get(0);
        
    }
    
}
