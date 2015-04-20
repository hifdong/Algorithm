/*
 * Given numRows, generate the first numRows of Pascal's triangle.
 *For example, given numRows = 5,
 *Return
 *[
 *     [1],
 *    [1,1],
 *   [1,2,1],
 *  [1,3,3,1],
 * [1,4,6,4,1]
 *]
 *解题思路：每一个数字i等于上于行的i-1与i个数字的加和
 * */

package com.dong;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle { 
     public List<List<Integer>> generate( int numRows) {

          List<List<Integer>> list = new ArrayList<List<Integer>>();
           if (numRows <= 0) {
            return list;
          }
          
          List<Integer> listParent = Arrays. asList(1);
          list.add(listParent);
           for ( int i = 2; i <= numRows; i++) {
              List<Integer> listChild = new ArrayList();
               for ( int j = 0; j < i; j++) {
                    int left = 0;
                    if (j - 1 < 0 ) {
                        left  = 0;
                   } else {
                        left = listParent.get(j - 1);
                   }
                    int right = 0;
                    if (j + 1 >= i) {
                        right = 0;
                   } else {
                        right = listParent.get(j);
                   }
                   listChild.add(left + right);
              }
              list.add(listChild);
              listParent = listChild;
          }
           return list;
     }
     
}