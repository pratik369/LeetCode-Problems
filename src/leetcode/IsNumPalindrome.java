/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Determine whether an integer is a palindrome. Do this without extra space.


*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class IsNumPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int div = 1;        //eg:1221
        while(x/div >= 10)
            div*=10;        //div =1000
        while(x!=0){
            int left = x/div; //left = 1
            int right = x%10;   //right = 1
            if(left!=right)
                return false;
            x=(x%div)/10;   //x=22
            div/=100;       //div=10
        }
        return true;
    }
    
}
