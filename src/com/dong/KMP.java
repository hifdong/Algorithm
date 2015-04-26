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
               while (j > 0 && s.charAt(i) != p.charAt(j)) {  //  ����j���±굽��һ��ƥ��㣻ע��j�Ǵ���0�����Ǹ���Ҫ������
                  j = pi.get(j - 1);  
              }
               if (s.charAt(i) == p.charAt(j)) {         //���ƥ����pi��i�����ȼ�1
                   j++;
              }
               if (j == pLen) {   //�ҵ���һ��ƥ��Ĵ���λ�ú����
                    break;
              }

          }
           if (j == pLen) {
               return i + 1 - j ;  //i ��1����Ϊbreak��iû���ü���1
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