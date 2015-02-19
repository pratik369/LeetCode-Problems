package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
*/

/**
 *
 * @author Pratik
 */
public class MergeSortedArrays {
    public void merge(int A[], int m, int B[], int n) {
        if(A == null || B == null)
            throw new NullPointerException();
        if(A.length < m+n-1)
            throw new IllegalArgumentException();
        int next = m+n-1;
        m--;
        n--;
        
        while(m>=0 && n>=0){
            if(A[m]>B[n])
                A[next--]=A[m--];
            else
                A[next--]=B[n--];
        }
        while(n>=0)
            A[next--]=B[n--];
        
    }
}
