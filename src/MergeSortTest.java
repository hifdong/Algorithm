import java.util.*;

public class MergeSortTest {

	public void mergeSort(int[] arr)
	{
		if(arr != null)
		{
		sort(arr, 0, arr.length - 1);
		}
	}
	
	public void sort(int[] arr, int left, int right)
	{
		if(left < right)  //不可少
		{
			int center = (left + right) / 2;
			sort(arr, left ,center);
			sort(arr, center + 1, right);
			merge(arr, left, center, right);
		}
	}
	
	public void merge(int[] arr, int left, int center, int right)
	{
		int[] tempArr = new int[arr.length];
		int mid = center + 1;
		int tempIndex = left;  //临时数组起始索引
		int temp = left;  //关键在于此处，要保存原开始位置，而不是 0！！！
		
		while(left <= center && mid <= right)
		{
			if(arr[left] < arr[mid])
			{
				tempArr[tempIndex++] = arr[left++];
			}
			else
			{
				tempArr[tempIndex++] = arr[mid++];
			}
		}
		while(left <= center)
		{
			tempArr[tempIndex++] = arr[left++];
		}
		while(mid <= right)
		{
			tempArr[tempIndex++] = arr[mid++];
		}
		
		System.out.println(Arrays.toString(arr));
		
        while(temp <= right)
        {
        	arr[temp] = tempArr[temp++];
        }
	}
	
	public static void main(String [] args)
	{
		int[] arr = {1, 3 ,5 ,7, 9, 2, 4, 6, 8, 10};
		MergeSortTest ms = new MergeSortTest();
		ms.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
