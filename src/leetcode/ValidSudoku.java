/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
*/
package leetcode;

import java.util.ArrayList;

/**
 *
 * @author Pratik
 */
public class ValidSudoku {
     public boolean isValidSudoku(char[][] board) {
        if(board==null || board.length==0 || board[0].length==0)
            return false;
        
        
        int len = board.length;
        ArrayList<Integer> visited = new ArrayList<Integer>();
        // check rows
        for(int i = 0; i<len; i++){
                visited.clear();
                for(int j = 0; j<len; j++)
                    if(!process(visited,board[i][j]))
                        return false;
        }
        // check columns
        for(int i=0; i<len;i++){
            visited.clear();
            for(int j=0;j<len;j++)
                if(!process(visited,board[j][i]))
                    return false;
        }
        //check block
        for(int i=0;i<len;i+=3)
                for(int j=0;j<len;j+=3){
                    visited.clear();
                    for(int k = 0;k<len;k++)
                        if(!process(visited,board[i+k/3][j+k%3]))
                            return false;
        }
        
        return true;
        
    }
    
    private boolean process(ArrayList<Integer> visited, char digit){
        if(digit=='.')
            return true;
        int num = Character.getNumericValue(digit);
        if(num<1 || num>9 || visited.contains(num))
            return false;
        visited.add(num);
        return true;
    }
    
}
