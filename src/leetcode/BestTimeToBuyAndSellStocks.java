/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        
        if(prices == null)
            throw new NullPointerException();
        if(prices.length <= 1)
            return 0;
            
        int res = 0, minValue = prices[0];
        
        for(int i = 1; i<prices.length; i++){
            res=Math.max(res,prices[i] - minValue);
            minValue = Math.min(minValue,prices[i]);
        }
        
        return res;
        
    }
}
