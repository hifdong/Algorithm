package com.dong;


import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;


public class LinePoint {
    Map<String, Double> line = new HashMap<String, Double>();
    Map<Map, Integer> table = new HashMap<Map, Integer>();
	
	private int maxPoint(Point [] points)
	{
/*	
*		for(Point p1 : points)
*		{
*			String k = "0";
*			double b = 0;
*			for(Point p2 : points)
*			{
*				if(p1.x == p2.x && p1.y == p2.y)
*				{
*					continue;
*				}
*				if(p2.x == p1.x)
*				{
*					k = "Max";
*				}
*				else
*				{
*				    k = String.valueOf((double)(p2.y - p1.y) / (p2.x - p1.x)) ;
*				}
*				if(k != "Max")
*				b = p2.y - Double.valueOf(k.toString()) * p2.x;
*			}
*			line.put((String)k, b);
*			if(table.containsKey(line))
*			{
*				int temp = table.get(line);
*				table.put(line, temp + 1);
*			}
*			else
*			{
*				table.put(line, 1);
*			}
*		}
*		int maxNum = 0;
*		Iterator iterator = table.entrySet().iterator();
*		while(iterator.hasNext())
*		{
*			Map.Entry entry = (Map.Entry)iterator.next();
*			int value = Integer.valueOf((String) entry.getValue());
*			if(value > maxNum)
*			{
*				maxNum = value;
*			}
*			
*		}
*		return maxNum;
**/
		//TODO Line Point algorithm
		return 0;
	}
    
	public void test()
	{
		
	}
}

class Point{
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}
