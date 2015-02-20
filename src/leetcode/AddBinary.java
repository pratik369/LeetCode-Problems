/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".   
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if(a==null || a.length()==0)
            return b;
        if(b==null || b.length()==0)
            return a;
            
        StringBuilder res = new StringBuilder();
        int nextPosA = a.length()-1;
        int nextPosB = b.length()-1;
        int carry = 0;
        
        while(nextPosA>=0 || nextPosB>=0 || carry>0){
            int num1 = nextPosA>=0?a.charAt(nextPosA--)-'0':0;
            int num2 = nextPosB>=0?b.charAt(nextPosB--)-'0':0;
            int current = (num1+num2+carry)%2;
            carry = (num1+num2+carry)/2;
            res.insert(0,current);
        }
        return res.toString();
        
    }
}
