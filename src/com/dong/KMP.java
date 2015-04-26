/**
 * KMP algorithm
 * @autor hanfang Dong 20150422
 */

package com.dong;

import java.util.Map;
import java.util.HashMap;


public class KMP {
   
     public int kmp(String strS, String strP) {
          StringBuffer s = new StringBuffer(strS);
          StringBuffer p = new StringBuffer(strP);
           int sLen = s.length();
           int pLen = p.length();
           int i = 0;
           int j = 0;
          
          Map<Integer, Integer> pi = new HashMap<Integer, Integer>();
          pi = calculatePrefix(p);
           for (i = 0; i < sLen; i++) {
               while (j > 0 && s.charAt(i) != p.charAt(j)) {  //  回溯j的下标到上一个匹配点；注意j是大于0，这是个重要的条件
                  j = pi.get(j - 1);  
              }
               if (s.charAt(i) == p.charAt(j)) {         //如果匹配则pi（i）长度加1
                   j++;
              }
               if (j == pLen) {   //找到第一个匹配的串的位置后结束
                    break;
              }

          }
           if (j == pLen) {
               return i + 1 - j ;  //i 加1是因为break后i没来得及加1
          } else {
               return -1;
          }
     }    
     
     public Map<Integer, Integer> calculatePrefix(StringBuffer p) {
           int pLen = p.length();
           int j = 0;
          Map<Integer, Integer> pi = new HashMap<Integer, Integer>();
          
          pi.put(0, 0);
          
           for ( int i = 1; i < pLen; i++) {
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
              j = pi.get(j - 1);
            }
            if (p.charAt(i) == p.charAt(j)) {
              j++;
            }
            pi.put(i, j);
          }
           return pi;
     }
     
     public void test() {
        KMP kmp = new KMP();
        int result = kmp.kmp( "caaabaaaaaacababcaa", "ababc");
        System. out.println( "result is : " + result);
         result = kmp.kmp( "ababcaa", "ababc");
        System. out.println( "result is : " + result);
     }
}