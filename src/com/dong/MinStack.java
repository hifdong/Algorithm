/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * ˼·:ά��һ����СԪ�صļ�ֵջ
 * ������
 * 13/04/2015
 * */

package com.dong;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class MinStack {
     LinkedList<Integer> minStack = new LinkedList<Integer>();
     LinkedList<Integer> minNumStack = new LinkedList<Integer>();
       
        int minNum = Integer.MAX_VALUE;
       
        public void push(int x) {    
             if (x <= minNum ) {  //�Է�ɾ��
                 minNum = x;
                 minNumStack.addFirst(x);
             }
             minStack.addFirst(x);
         }

         public void pop() {
           if ( minStack.size() >= 0 && minStack.getFirst() == minNum) {
                minStack.removeFirst();
//             if (minNumStack.size() > 0) {
                    minNumStack.removeFirst();
                    if ( minNumStack.size() > 0) {
                         minNum = minNumStack.getFirst();
                   } else {
                         minNum = Integer. MAX_VALUE;  //��������Ԫ�س���ջ��minNum�����ϴ���С��Ӱ���´�Ԫ����ջ
                   }
//             }
          } else {
                if ( minStack.size() > 0) {
                    minStack.removeFirst();
               }
          }
               
         }

         public int top() {
           if ( minStack.size() > 0) {
                return minStack.getFirst();
          } else {
                return -1;
          }
          
         }

         public int getMin() {
            return minNum;
         }
}