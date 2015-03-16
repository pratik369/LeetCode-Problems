/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

click to show spoilers.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class FindPeak {
    public int findPeakElement(int[] num) {
        int left = 0, right = num.length - 1, mid = -1;
        while (left <= right) {
            mid = (left + right) /2;
            if ((mid == 0 || num[mid-1] <= num[mid]) && (mid == num.length - 1 || num[mid] >= num[mid+1]))
                return mid;
            if (mid > 0 && num[mid-1] > num[mid]) {
                right = mid - 1;
            } else if (num[mid+1] > num[mid]) {
                left = mid + 1;
            }
        }
        return mid;
    }
}
