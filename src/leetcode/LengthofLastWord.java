/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s==null)
            throw new NullPointerException();
            
        int len =0;
        for(int i = s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isSpaceChar(c)){
                if(len>0)
                    return len;
            }else
                len++;
            
        }
        return len;
    }
    
}
