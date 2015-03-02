/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
*/


/*
Given a number n, how many unique BST's can be constructed?

Think it in a deductive way:
n=1, count(1) = 1 unique BST.
n=2, pick one value, and the one remaining node can be built as one BST.
i.e. count(2) = 2 * count(2-1).
n=3, pick one value i, and split the remaining values to two groups: [1 .. i-1] goes to left subtree and [i+1 .. n] goes to right subtree.
i.e. count(3) = count(3-1) + count(1)*count(1) + count(3-1)
... ...
n=k, suppose count(0) = 1, we then have:
count(k) = sum_{i=0}^(k-1) (count(i)*count(k-1-i))
This formula is known as Segner's recurrence relation.
To implement it, it is nature to use DP: store previous count values in an array and compute sum on them.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class UniquePossibleBinaryTrees {
    public int numTrees(int n) {
        if(n<0)
            throw new IllegalArgumentException();
            
        if(n==0)
            return 0;
        int[] sol = new int[n+1];
        
        
        sol[0] = 1;
        sol[1] = 1;
        
        for(int i = 2; i<=n; i++)
            for(int j = 0; j<i; j++)
                sol[i] += sol[j] * sol[i-j-1];
        return sol[n];
        
        
        
        
    }
}
