package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.
*/

/**
 *
 * @author Pratik
 */
public class Anagrams {
    public List<String> anagrams(String[] strs) {
            
        if(strs == null)
            throw new NullPointerException();
        if(strs.length == 0)
            return new ArrayList<String>();
        
        HashMap<String, String> map = new HashMap<String, String>();
        List<String> result = new ArrayList<String>();
        
        for(String str : strs){
            char[] c  = str.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            
            if(map.containsKey(sortedString)){
                String original = map.get(sortedString);
                
                if(original != null){
                    result.add(original);
                    map.put(sortedString,null);
                }
                result.add(str);
            } else {
              map.put(sortedString, str);  
            }
        }
        
        return result;
    }
    
}
