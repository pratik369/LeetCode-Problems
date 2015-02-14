/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/


package leetcode;

import java.util.Stack;

/**
 *
 * @author Pratik
 */
public class ValidParenthesis {
    
    public boolean isValid(String s) {
        if(s==null)
            throw new NullPointerException();
            
        Stack<Character> stack = new Stack<Character>();
        char c[] = s.toCharArray();
        for (char a : c){
            switch(a){
                case '(': 
                    {
                        stack.push(a);
                        break;
                    }
                case '{':
                    {
                        stack.push(a);
                        break;
                    }
                case '[':
                    {
                        stack.push(a);
                        break;
                    }
                case ')':
                    {
                        if(stack.isEmpty() || stack.pop() != '(')
                            {
                                return false;
                            }
                        break;
                        
                    }
                case '}':
                    {
                        if(stack.isEmpty() || stack.pop() != '{')
                            {
                                return false;
                            }
                        break;
                    }
                case ']':
                    {
                        if(stack.isEmpty() || stack.pop() != '[')
                            {
                                return false;
                            }
                        break;
                        
                    }
                default:
                    throw new IllegalArgumentException();
                
            }
        }
        return stack.isEmpty();
    }
}
