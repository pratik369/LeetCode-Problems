/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/
package leetcode;


/**
 *
 * @author Pratik
 */
public class ExcelSheetColNum {
    
     public int titleToNumber(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i ++) {
            r = r * 26 + s.charAt(i) - 64;
        }
        return r;
    }
    
}
