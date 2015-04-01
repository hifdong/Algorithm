/*
 * 31/01/2015
 * Hanfang Dong
 * 
 *implement interface int reverse(int par);
 *����par�Ǹ��������������������-2����ת�󳬹����ε��������-1
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
		long num = param; //�����������ڲ������䲻����תΪlong
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
			if(retNum > Integer.MAX_VALUE)  //����Ƿ��ں����int������
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
			int testNum = rand.nextInt(300000000); //��ȫ���������һЩ����
			System.out.println("test Num: " + testNum);
			//int testNum = 7939;
			//System.out.println("test Num: " + testNum);
			System.out.println(ri.reverse(testNum));
			
		}
	}
}
