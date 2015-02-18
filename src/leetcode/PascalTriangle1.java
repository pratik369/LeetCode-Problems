/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class PascalTriangle1 {
    
    public List<List<Integer>> generate(int numRows) {
        if(numRows<0)
            throw new IllegalArgumentException();
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(numRows==0)
            return res;
        
        List<Integer> rowOne = new ArrayList<Integer>();
        rowOne.add(1);
        res.add(rowOne);
        
        List<Integer> curRow = rowOne;
        for(int cur = 1; cur < numRows; cur++){
            curRow=getNextRow(curRow);
            res.add(curRow);
        }
        
        return res;
    }
    
    private List<Integer> getNextRow(List<Integer> preRow){
        List<Integer> res = new ArrayList<>();
        res.add(preRow.get(0));
        for(int i = 0; i<preRow.size()-1;i++){
            res.add(preRow.get(i)+preRow.get(i+1));
        }
        res.add(preRow.get(preRow.size()-1));
        return res;
    }
    
}
