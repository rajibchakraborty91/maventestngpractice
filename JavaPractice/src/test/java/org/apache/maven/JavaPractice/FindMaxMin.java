package org.apache.maven.JavaPractice;

public class FindMaxMin {
	
	public static void maxmin(int[] arr)
	{
		int smallest = Integer.MIN_VALUE;
		
		//int highest = Integer.MAX_VALUE;
		int highest = arr[0];
		int lowest = arr[0];
		int second=arr[1];
		
		//--------------------size of an aarryyyy
		int count = 0;
		for (int x : arr)
		{
			count++;
		}
		System.out.println(count);
		//------------------ for  -----------
		for (int i =0;i<=arr.length-1;i++)
		{
			
			
			if (arr[i]>=highest)
			{
				
				second = highest;
				highest = arr[i];
			}
			
			
			if (arr[i]<=lowest)
			{
				lowest = arr[i];
			}
		}
		
		System.out.println("highest number ===>"+highest);
	
		
		System.out.println("lowest number ===>"+lowest);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int[] arr = new int[]{2,1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323};
		maxmin(arr);
		
	}

}
