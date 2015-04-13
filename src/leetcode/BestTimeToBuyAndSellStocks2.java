/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class BestTimeToBuyAndSellStocks2 {
    public int maxProfit(int[] prices) {
        if(prices == null)
            throw new NullPointerException();
        if(prices.length == 1)
            return 0;
        
        int maxProfit = 0;
        for(int i = 1;i< prices.length; i++){
            maxProfit += Math.max(0,prices[i] - prices[i - 1]);
        }
        
        return maxProfit;
        
    }
    
}
