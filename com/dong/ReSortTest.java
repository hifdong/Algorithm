//27/01/2015
//Hanfang Dong
/* Given an array [a1, a2, ..., an, b1, b2, ..., bn], transform it to [a1,
b1, a2, b2, ..., an, bn].
Requirement: time complexity O(nlogn), space complexity O(logn)
Sol: the base idea is to use quicksort techniques. Suppose the current array
is A, whose size is 2k.
1. Divide A into four segments: A = [A1 A2 B1 B2], where A1.size = B1.size =
k / 2, B1.size = B2.size = k - k / 2;
2. Swap A2 and B1, and we get A = [A1 B1 A2 B2]. In this step, we actually
need to rotate [A2 B1] to the right by k - k / 2 items. This can be done by
reversing [A2 B1] first, and then reversing [A2] and [B1] respectively.
3. Recursive on [A1 B1] and [A2 B2] respectively.

Example: A = [1 2 3 4 5 6 7 8 9 10]
A1 = [1 2], A2 = [3 4 5], B1 = [6 7], B2 = [8 9 10]
After 2nd step, A = [1 2 | 6 7 | 3 4 5| 8 9 10]
For the 3rd step, process [1 2 6 7] and [3 4 5 8 9 10] repectively
*/
package com.dong;

import java.util.Arrays;


public class ReSortTest {

	public void reSort(int[] data, int p, int r)
	{
		if(r - p > 1)
		{
		int q = patition(data, p, r);
		reSort(data, p, q);
		reSort(data, q + 1, r);  //不可在patition中放两个子递归，否则第二个递归参数会被改变而无法运行
		}
	}
	
	public int patition(int[] data, int p, int r)
	{
		int aBeg = p;
		int aEnd = (p + r)/2;
		int bBeg = aEnd + 1;
		int bEnd = r;
		
		int aK = (aBeg + aEnd + 1)/2;  //保证偶数取上限，这是使用aK的基础！！！
		int bK = (bBeg + bEnd + 1)/2;
		
		swap(data, aK, bK - 1);
		swap(data, aK, aK + aK - 1 - aBeg );
		swap(data, aK + aK - aBeg , bK - 1);
		
		System.out.println(Arrays.toString(data));
        return aK + aK - 1 - aBeg;
	}
	
	public void swap(int[] data, int p, int q)
	{
		while(p < q)
		{
			int temp = data[p];
			data[p] = data[q];
			data[q] = temp;
			p++;
			q--;
				
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//int[] arr = {2, 3, 4, 7, 8, 9};
		ReSortTest rt = new ReSortTest();
		rt.reSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
