/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class CountAndSay {
    
    
    public String countAndSay(int n) {
        if(n<1)
            throw new IllegalArgumentException();
        String str = "1";
        
        for(int j=1;j<n;j++){
            str=nextChar(str);
        }
        return str;
    }
    
    public String nextChar(String str){
        StringBuilder newstr = new StringBuilder();
        char cur = str.charAt(0);
        int count = 1;
        
        for(int i=1; i<str.length();i++)    {
                char ch = str.charAt(i);
                if(ch==cur)  {
                        count++;
                    }
                else{
                        newstr.append(count);
                        newstr.append(cur);
                        cur=ch;
                        count=1;
                    }
        }
        
        newstr.append(count);
        newstr.append(cur);
        
        return newstr.toString();
    }
}
