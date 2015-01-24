import java.util.*;

public class Test {
    public static void main(String[] args)
    {
    	int[] A = {2, 1, 4, 6, 9, 7, 6, 4, 3, 0};
    	HeapSort hs = new HeapSort();
    	hs.heapSort(A);
    	System.out.println(Arrays.toString(A));
    }
}
