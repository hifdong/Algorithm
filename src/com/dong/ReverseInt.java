/*
 * 31/01/2015
 * Hanfang Dong
 * 
 *implement interface int reverse(int par);
 *对于par是负数的情况不作处理，返回-2，反转后超过整形的情况返回-1
 *
*/

package com.dong;

import java.util.*;

public class ReverseInt {

	public int reverse(int param)
	{
		if(param < 0)
		{
			System.out.println("num < 0");
			return -2;
		}
		int i = 10;
		long retNum = 0;
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		long num = param; //在整形区间内操作区间不够，转为long
		while((num * 10) / i > 0)
		{
			j = (int)(num % i) * 10 / i;
			list.add(j);

			i = i * 10;
		}
		
		for(int iter = 0; iter < list.size(); iter++)
		{
			int ie = list.size() - 1 - iter;
			//System.out.println(list.get(iter));
			retNum = retNum + list.get(iter) * (long)Math.pow(10, ie);
			if(retNum > Integer.MAX_VALUE)  //检查是否在合理的int区间内
			{
				return -1;
			}
		}
		
		return (int)retNum;
	}
	
	
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		ReverseInt ri = new ReverseInt();
		for(int i = 0; i < 20; i ++)
		{
			int testNum = rand.nextInt(300000000); //完全的随机还有一些问题
			System.out.println("test Num: " + testNum);
			//int testNum = 7939;
			//System.out.println("test Num: " + testNum);
			System.out.println(ri.reverse(testNum));
			
		}
	}
}
