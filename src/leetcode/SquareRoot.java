/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Pratik
 */
public class SquareRoot {
    public int sqrt(int x) {
        if(x<0)
            throw new IllegalArgumentException();
        
        long low = 0;
        long high = x/2 + 1;
        while(low<=high){
            long mid = low +(high - low) /2;
            long square = mid * mid;
            
            if((int)square == x)
                return (int)mid;
            else if(square < x)
                low = mid + 1;
            else    
                high = mid - 1;
            
        }       
        
        return (int)high;
        
    }
    
}
