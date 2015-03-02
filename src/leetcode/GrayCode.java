/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
*/
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class GrayCode {
     public List<Integer> grayCode(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(0);
        if(n<0)
            throw new NullPointerException();
        for(int i =0;i<n;i++){
            int flip = 1<<i;
            for(int j = nums.size()-1;j>=0;j--)
                nums.add(nums.get(j) | flip);
        }
        return nums;
    }
}
