/*题 目：求n的n！尾部含有的0的个数。
 * 思路：
 * 要有尾数0，必要有5才要生成0；
 * 对于含有一个5的数，通过乘2可生成两个0，如5， 10，15。
 * 对于含有两个5的数，通过乘4可生成两个0，如25，50.
 * 对于含有n个5的数，通过乘n个2可生成n个0.*/

package com.dong;

public class FactorialTrailingZeros {
    public int tralingZeroes( int n) {
     if (n <= 0) {
           return 0;
     }
     
        int retNum = 0;
        int limit = ( int)(Math. log(n) / Math.log (5));
        for (int i = 1; i <= limit; i++) {
          retNum += n / Math. pow(5, i);
        }
        return retNum;
    }
}