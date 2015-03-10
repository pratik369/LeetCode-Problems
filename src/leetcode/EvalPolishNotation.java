/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/
package leetcode;

import java.util.Stack;

/**
 *
 * @author Pratik
 */
public class EvalPolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(String s : tokens){
            if(s.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if(s.equals("-"))
                stack.push(-stack.pop() + stack.pop());
            else if(s.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if(s.equals("/")) {
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend/divisor);
            }
            else
                stack.push(Integer.parseInt(s));
        }    
        
        return stack.pop();
    }
    
}
