/*�� Ŀ����n��n��β�����е�0�ĸ�����
 * ˼·��
 * Ҫ��β��0����Ҫ��5��Ҫ����0��
 * ���ں���һ��5������ͨ����2����������0����5�� 10��15��
 * ���ں�������5������ͨ����4����������0����25��50.
 * ���ں���n��5������ͨ����n��2������n��0.*/

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