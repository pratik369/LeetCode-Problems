/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class ExcelSheetColTitle {
    public String convertToTitle(int n) {
       String r = "";
        while (n > 0) {
            r = (char)(65 + (n - 1) % 26) + r;
            n = (n - 1) / 26;
        }
        return r;
        
    }
}
