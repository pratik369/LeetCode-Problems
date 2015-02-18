/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/

package leetcode;

/**
 *
 * @author Pratik
 */
public class SentenceIsPalindrome {
     public boolean isPalindrome(String s) {
        if(s==null)
            return false;
        if(s.length()==0)
            return true;
        if(s.length()==1)
            return true;
        
        int start = 0;
        int end = s.length()-1;
        
        s=s.toLowerCase();
        
        while(start<end){
            while(start<end && !Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start)))
                start++;
            while(start<end && !Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end)))
                end--;
            if(s.charAt(start) != s.charAt(end))
                return false;
            
            start++;
            end--;
            
        }
        
        return true;
        
    }
}
