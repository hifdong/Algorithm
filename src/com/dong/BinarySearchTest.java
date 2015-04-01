package com.dong;

import java.util.*;

public class BinarySearchTest {
    public int search(int[] arr, int x, int left, int right)
    {
    	int mid = (left + right)/2;
    	if(arr[mid] == x)
    		return mid;
    	if(arr[mid] > x)
    	{
    	  return	search(arr, x, left, mid);
    	}
    	else
    	{
    	  return	search(arr, x, mid + 1, right);
    	}
    	
    }
    
    public int binarySearch(int[] arr, int x)
    {
    	int ret = search(arr, x, 0, arr.length - 1);
    	return ret;
    }
    
    public static void main(String[] args)
    {
    	BinarySearchTest bs = new BinarySearchTest();
    	int[] arr = {1, 2, 3, 5, 7, 9};
    	int t = bs.binarySearch(arr, 5);
    	System.out.println(t);
    }
}
