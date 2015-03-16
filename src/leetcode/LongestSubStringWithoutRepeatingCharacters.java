/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
*/
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Pratik
 */
public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s==null)
            throw new NullPointerException();
        if(s.length() == 0)
            return 0;
        
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        map.put(s.charAt(0),0);
        
        int start = 0;
        int currentLength = 1;
        int longestLength = 1;
        
        for(int i = 1; i<s.length(); i++){
            char c = s.charAt(i);
            Integer charLastSeenAt = map.get(c);
            
            if(charLastSeenAt != null && charLastSeenAt>= start){
                start = charLastSeenAt + 1;
                currentLength = i - start + 1;
                
            } else {
                currentLength++;
                longestLength = Math.max(currentLength,longestLength);
            }
            
            map.put(c,i);
        }
        
        return longestLength;
    }
    
}
