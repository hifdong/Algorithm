//27/01/2015
//Hanfang Dong
// Find min k element
package com.dong;
import java.util.*;

public class FindKMinElement {
	
	public int[] findKMin(int[] data,  int k)
	{
		int[] reArr = new int[k];
		if(k > data.length)
		{
			return data;
		}
		
		findKMin(data, 0, data.length - 1, k);
		
        for(int i = 0; i < k; i++)
        {
     	   reArr[i] = data[i];
        }
        return reArr;
	}

	public void findKMin(int[] data, int p, int r, int k)
	{
		
		if(p < r)
		{
			int q = patition(data, p, r);
			if(q - p + 1 == k)
			{
              return;
			}
			if(q - p + 1 > k)
			{
			    findKMin(data, p, q - 1, k);  //q-1 not q£¬or dead loop£¡£¡£¡
			}
			else
			{
			    findKMin(data, q+ 1, r, k - (q - p + 1));
			}
		}
	}
	
	public int patition(int[] data, int p, int r)
	{
		int x = data[r];
		int i = p - 1;
		for(int j = p; j <= r - 1; j++ )
		{
			if(data[j] <= x)
			{
				i = i + 1;
				swap(data, i, j);
			}
			
		}
		swap(data, i + 1, r );
		return i + 1;
		
	}
	
	public void swap(int[] data, int p, int r)
	{
		int temp = data[p];
		data[p] = data[r];
		data[r] = temp;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 3, 5 ,6, 3,7 ,8 ,9, 2, 4};
		FindKMinElement fm = new FindKMinElement();
		int[] reArr = fm.findKMin(arr, 3);
		System.out.println(Arrays.toString(reArr));
	}
}
