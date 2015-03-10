package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

/**
 *
 * @author Pratik
 */
public class FindMin1 {
    public int findMin(int[] num) {

        if (num == null) 
            throw new NullPointerException();

        if (num.length == 0) 
            throw new IllegalArgumentException();

        if (num[0] <= num[num.length - 1]) 
           return num[0];
        
        int min = 0;
        int max = num.length -1;

        while (min < max) {
            int test = (min + max) / 2;
            if (num[test] >= num[0]) 
                min = test + 1;
            else 
                max = test;
        }
        return num[min];
    }
    
}
