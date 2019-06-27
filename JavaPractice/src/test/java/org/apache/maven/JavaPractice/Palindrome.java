package org.apache.maven.JavaPractice;

import org.apache.poi.hssf.util.PaneInformation;

public class Palindrome {

	public static void palindromechecck(String[] arr)
	{
		int count=0;
		int n = arr.length;
		//System.out.println(arr.length);
		
		for (int i = 0;i<n/2;i++)
		{
			
			/*System.out.println(arr[i]);
			System.out.println(arr[n-i-1]);*/
			if (arr[i].equals(arr[n-i-1]))
					{
						count = 1;
					}
			
			else
			{
				count = 0;
				System.out.println("not a palindrom----");
				break;
			}
			
		}
		
		if (count==1)
		{
			System.out.println("palidrome");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String word = "racecar";
				
		palindromechecck(word.split(""));		
		System.out.println(word);
	}

}
