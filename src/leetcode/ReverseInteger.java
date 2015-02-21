/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class ReverseInteger {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
        rev = rev * 10 + (x%10);
        x/=10;
        }
        if(rev>Integer.MAX_VALUE)
            return 0;
        if(rev<Integer.MIN_VALUE)
            return 0;
        return (int)rev;
    }
    
}
