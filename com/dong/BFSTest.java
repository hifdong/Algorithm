//author: Hanfang Dong
//date: 01/25/2015
//BFS algorithm
package com.dong;

import java.util.*;

public class BFSTest {

	private int[] color;
	private int[] d;
	private int[] parent;
	
	private int WHITE = 0;
    private int GRAY = 1;
	private int BLACK = 2;
	
	public void bFS(int[][] arr, int s)
	{
		color = new int[arr[0].length];
		d = new int[arr[0].length];
		parent = new int[arr[0].length];
		
		for(int i = 0; i< arr[0].length; i++)
		{
			color[i] = WHITE;
			d[i] = 0;
			parent[i] = -1; 
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(s);
		color[s] = GRAY;
		d[s] = 0;
		parent[s] = -1;
		
		while(!q.isEmpty())
		{
			
			int u =q.poll();
			for(int v = 0; v < arr[u].length; v++)
			{
				if(arr[u][v] != 0 && color[v] == WHITE)
				{
					color[v] = GRAY;
					d[v] = d[u] + 1;
					parent[v] = u;
					q.offer(v);
				}
					
			}
			color[u] = BLACK;
		}
	}
	
	public void printPath(int[][] G, int s, int v)
	{
		if(v == s)
		{ 
			System.out.println(s);
		}
		else
		{
			if(parent[v] == -1)
			{
				System.out.println("no path to v:" + v);
			}
			else
			{
				printPath(G, s, parent[v]); //parent
				System.out.println(v);  //child
			}
		}
	}
	
	public static  void main(String[] args)
	{
		int[][] arr = {
				{0, 1, 0, 0, 1},
				{1, 0, 1, 1, 1},
				{0, 1, 0, 1, 0},
				{0, 1, 1, 0, 1},
				{1, 1, 0, 1, 0}
		};
		
		System.out.println(Arrays.deepToString(arr));
		BFSTest bs = new BFSTest();
		bs.bFS(arr, 0);
		bs.printPath(arr, 0, 2);
		
	}
}
