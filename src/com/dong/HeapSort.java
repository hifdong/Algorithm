
package com.dong;

import java.util.Arrays;

//Author: Dong Hanfang
//2015/01/21
//readme:root = 0 in array


public class HeapSort {
    public void maxHeapify(int[] A, int i, int size)
    {
    	int left = i*2 + 1;
    	int right = i*2 + 2;
    	int largest = i;
    	
    	if(left < size && A[left] > A[i])
    	{
    		largest = left;
    	}
    	if(right < size && A[right] > A[largest])
    	{
    		largest = right;
    	}
    	if(largest != i)
    	{
    		swap(A, largest, i);
    		maxHeapify(A, largest, size);
    	}
    }
    
    public void maxHeapify(int[] A, int i)
    {
    	    maxHeapify(A, i, A.length);
    }
    
    private void swap(int[] A, int i, int j)
    {
    	int temp = A[i];
    	A[i] = A[j];
    	A[j] = temp;
    }
    
    public void buildMaxHeap(int[] A)
    {
    	for(int i = A.length/2; i >= 0; i--)
    	{
    		maxHeapify(A, i);
    	}
    }
    
    public void heapSort(int[] A)
    {
    	
    	buildMaxHeap(A);
    	System.out.println("After build max heap: " + Arrays.toString(A));
    	
        for(int i = A.length - 1; i > 0; --i)
        {
        	swap(A, 0, i);
        	System.out.println("In out put,after swap: " + i + Arrays.toString(A));
        	maxHeapify(A, 0, i);  //i can't add 1.before maxHeapify, size has minux 1
        	System.out.println("In out put,after max: " + i + Arrays.toString(A));
        }
    	
    }
}
