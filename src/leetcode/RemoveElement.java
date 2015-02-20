/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class RemoveElement {
     public static int removeElement(int[] A, int elem) {
        int count = 0;  
   for (int i=0; i<A.length; i++) {  
     if (A[i] == elem) { // find one, skip  
       count++;  
     } else  { // copy over  
         System.out.println(i-count + " "+i+ " " + count);
       A[i-count] = A[i];  
     }  
   }  
   return A.length - count;  
    }
     
    public static void main(String[] args){
        int A[] = {1,1,3,4,5,6,7};
        int res = removeElement(A,1);
        System.out.println(res);
        
    }
}
