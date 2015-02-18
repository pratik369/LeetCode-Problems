/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */

/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        
        if(rowIndex < 0)
            throw new IllegalArgumentException();
        
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        
        for(int i = 0; i<rowIndex; i++){
            res=getNextRow(res);
        }
        
        return res;
        
    }
    
    private List<Integer> getNextRow(List<Integer> preRow){
        List<Integer> res = new ArrayList<Integer>();
        res.add(preRow.get(0));
        
        for(int i=0 ;i<preRow.size()-1;i++){
            res.add(preRow.get(i)+preRow.get(i+1));
        }
        res.add(preRow.get(preRow.size()-1));
        return res;
    }
    
}
