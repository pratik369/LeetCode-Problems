/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Pratik
 */
public class RomanToInt {
     private static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    static{
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    public int romanToInt(String s) {
        if(s==null)
            throw new NullPointerException();
        return romanToInt(s,0);
    }
    
    private int romanToInt(String s, int start){
        if(start>=s.length())
            return 0;
            
        char c = s.charAt(start);
        int val = map.get(c);
        //incase of IXXLC
        if(start+1<s.length()){
            char c2 = s.charAt(start+1);
            int val2 = map.get(c2);
            if(val2 > val)
                return val2- val + romanToInt(s,start+2);
        }
        //in case of XII
        return val + romanToInt(s,start+1);
    }
    
}
