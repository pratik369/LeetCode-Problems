/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*

Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class CompareVersions {
    
    
    public int compareVersion(String version1, String version2) {
     
    String[] levels1 = version1.split("\\.");
    String[] levels2 = version2.split("\\.");
    
    /*for(int i=0;i<levels1.length;i++)
        System.out.println(levels1[i]);

    for(int i=0;i<levels2.length;i++)
        System.out.println(levels2[i]);
    */
    //System.out.println(levels1.length);
    int length = Math.max(levels1.length, levels2.length);
    for(int i = 0; i< length; i++){
        Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
        Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
        int compare = v1.compareTo(v2);
        //System.out.println(compare);
        if(compare!=0){
            return compare;
        }
    }

    return 0; 
    
    
    }
    
    public static void main(String[] args){
        CompareVersions cmp  = new CompareVersions();
        System.out.println(cmp.compareVersion("1.1.0", "1.0.1"));
    }
}
