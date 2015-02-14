/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

package leetcode;

/**
 *
 * @author Pratik
 */
public class ClimbStairs {
    
    public int climbStairs(int n) {
        if(n<0)
            throw new IllegalArgumentException();
        else if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        
        /*int one = 2;
        int two = 1;
        int step = 3;
        
        while(step<=n){
            int zero = one + two;
            two = one;
            one = zero;
            step++;
        }
        return one;*/
        
        
        int fib[] = new int[n+1];
        fib[0]=1;
        fib[1]=1;
        fib[2]=2;
        for(int i = 3;i<=n; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    
}
