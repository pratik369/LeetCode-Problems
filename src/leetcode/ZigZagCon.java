/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class ZigZagCon {
    
    public String convert(String s, int nRows) {
        if(s==null || nRows <= 0)
            throw new IllegalArgumentException();
        if(nRows == 1 || s.length() <= nRows)
            return s;
            
        char res[] = new char[s.length()];
        int csol = 0;
        
        for (int row = 0; row<nRows; row++){
            int i = row;
            while(i<s.length()){
                res[csol++] = s.charAt(i);
                if(row==0 || row==nRows-1)
                    i+=2*(nRows-1);
                else {
                    i+=2*(nRows-row-1);
                    
                    if(i<s.length())
                        res[csol++] = s.charAt(i);
                    
                    i+=2*row;
                }
            }
        }
        
        return new String(res);
    
    }
}
