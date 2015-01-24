import java.util.*;

public class ReverseString {

	public void swap(char[] arr, int begin, int end)
	{
		while(begin < end)
		{
			char temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++; 
			end--;
		}
		//System.out.println("in swap:" + Arrays.toString(arr));
		
	}
	
	public String reverse(String s)
	{
		char[] arr = s.toCharArray();
		//System.out.println("char arr:" + Arrays.toString(arr));
		int start = 0;
		swap(arr, 0, s.length() - 1);  //without this line, will can not reverse  why
		//System.out.println("char arr with one swap:" + Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == ' ')
			{
				swap(arr, start, i - 1);
				start = i + 1;
			}
			if(i == arr.length - 1)   //this is edge situation, be care!
			{
				swap(arr, start, i);
			}
		}

		return new String(arr);
	}
	
	public static void main(String [] args)
	{
		String s = "this is a test";
		System.out.println("befor:" + s);
		ReverseString rs = new ReverseString();
		String t = rs.reverse(s);
		System.out.println("after:" + t);
	}
}
