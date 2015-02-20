/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Write a function to find the longest common prefix string amongst an array of strings.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
    String minStr=strs[0];

    for(int i=1;i<strs.length;i++){
        if(strs[i].length()<minStr.length())
            minStr=strs[i];
    }
    int end=minStr.length();
    for(int i=0;i<strs.length;i++){
        int j;
        for( j=0;j<end;j++){
            if(minStr.charAt(j)!=strs[i].charAt(j))
                break;
        }
        if(j<end)
            end=j;
    }
    return minStr.substring(0,end);
    
}
}
