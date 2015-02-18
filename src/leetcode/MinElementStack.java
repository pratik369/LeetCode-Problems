/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/
package leetcode;

import java.util.Stack;

/**
 *
 * @author Pratik
 */
public class MinElementStack {
    private Stack<Integer> stack = new Stack<Integer>();  
    private Stack<Integer> minStack = new Stack<Integer>();  
      
    public void push(int x) {  
        if(stack.isEmpty() || x <= minStack.peek()) {  
            stack.push(x);  
            minStack.push(x);  
        } else {  
            stack.push(x);  
            minStack.push(minStack.peek());  
        }  
    }  
  
    public void pop() {  
        stack.pop();  
        minStack.pop();  
    }  
  
    public int top() {  
        return stack.peek();  
    }  
  
    public int getMin() {  
        return minStack.peek();  
    }  
}
