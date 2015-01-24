import java.util.*;

public class QuickSortTest {
static void QuickSort(int[] arr, int p, int r)
{
    if(p < r)
    {
    	int q = Partition(arr, p, r);
    	QuickSort(arr, p, q - 1);
    	QuickSort(arr, q+1, r);
    }
}

static int Partition(int[] arr, int p, int r)
{
	int x = arr[r];
	int i = p - 1;

	for(int j = p; j <= r - 1; j++)
	{
		if(arr[j] <= x)
		{
			i = i + 1;
            swap(arr, i, j);
		
		}
	}
	swap(arr, i+1, r);
	return i+1;
}
static void swap(int[] arr, int p, int q)
{
    int temp = arr[p];
    arr[p] = arr[q];
    arr[q] = temp;
}

public static void main(String[] args)
{
	int[] arr = {3, 5, 1, 4, 7, 0, 9};
    QuickSort(arr, 0, 6);
    System.out.println(Arrays.toString(arr));
}
}
