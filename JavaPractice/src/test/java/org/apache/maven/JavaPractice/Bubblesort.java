package org.apache.maven.JavaPractice;

public class Bubblesort {

	public static void bubblesort(int[] arr)
	{
		int temp=0;
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if (arr[j+1]<arr[j])
				{
					 temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int k = 0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {111,21,19,1,-92,44};
		
		bubblesort(arr);
		
		
		

	}

}
