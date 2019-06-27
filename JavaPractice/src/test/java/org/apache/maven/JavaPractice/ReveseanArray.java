package org.apache.maven.JavaPractice;

public class ReveseanArray {
	
	
	public static void reverse(int[] arr)
	{
		int[] newarr = new int[arr.length];
		int k=0;
		for (int i =arr.length-1;i>=0;i--)
		{
			
			newarr[k] = arr[i];
			k++;
					
		}
		
		System.out.println(newarr[0]);
	}
	
	public static void reversehalf(int[] arr)
	{
		int n=arr.length;
		int t;
		for(int j=0;j<n/2;j++)
		{
			t=arr[j];
			arr[j]=arr[n-j-1];
			arr[n-j-1]=t;
		}
	
		System.out.println(arr[1]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,24,37,44,75};
		
		reverse(arr);
		reversehalf(arr);
		
	String sr = "how are you";
	
	System.out.println(sr.length());

	}

}
