/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
*/
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Pratik
 */
public class IntegerToRoman {
    
    private static HashMap<Integer,String> map = new HashMap<Integer,String>();
    
    private static int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    
    private static void setup() {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }
    public String intToRoman(int num) {
        if(num == 0)
            throw new IllegalArgumentException();
        
        setup();
        
        StringBuilder builder = new StringBuilder();
        
        for(int i : bases){
            while(num>=i){
                builder.append(map.get(i));
                num-=i;
            }
        }
        
        return builder.toString();
    }
}
