//26/01/2015
//Hanfang Dong
//Condition of under sort data:
// 1. known max num
// 2. no duplicate num

import java.util.*;

public class BitMapSortAlgorithm {

	public void bitMapSort(int[] data)
	{
		int[] bitMap = new int[1000];  //Known the max number in data is <= 100
		for(int i = 0; i < data.length; i++)
		{
			if(bitMap[data[i]] != 1)
			{
				bitMap[data[i]] = 1;
			}
			else
			{
				System.out.println(data[i] + "is duplicate number");
			}
		}
		
		for(int i = 0; i < bitMap.length; i++)
		{
			if(bitMap[i] == 1)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[]  args)
	{
		//int[] arr = {1, 2, 4, 5, 6, 0, 99};
		int [] arr = new int[99];
		Random rand = new Random();
		for(int i = 0; i < 99; i ++)
		{
			int t = rand.nextInt(99);
			arr[i] = t;
		}
		BitMapSortAlgorithm bms = new BitMapSortAlgorithm();
		
		bms.bitMapSort(arr);
	}
}
