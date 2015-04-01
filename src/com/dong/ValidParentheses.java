/**
 * Data:3/3/2015
 * Author: Hanfang Dong
 * 
 */
package com.dong;

import java.util.*;

public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] charArray = s.toCharArray();
		if (charArray != null) {
			for (char c : charArray) {
				if (stack.isEmpty()) {
					stack.push(c);
				} else if (stack.peek() == '(' && c == ')') {
					stack.pop();
					continue;
				} else if (stack.peek() == '[' && c == ']') {
					stack.pop();
					continue;
				} else if (stack.peek() == '{' && c == '}') {
					stack.pop();
					continue;
				} else {
					stack.push(c);
				}
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
			
	}

	public static void main(String[] args) {
       String s = "[][]{}{}()()()()[";
       System.out.println(s);
       System.out.println("the result is :" + isValid(s));
       
       String s2 = "[][]{}{}()()()()[";
       System.out.println(s2);
       System.out.println("the result is:" + isValid(s));
	}
}
