package org.apache.maven.JavaPractice;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class FindDuplicate {

	public static void findupelementts(int[] arr)
	{
		int dupele=0;
		int[] newarr=new int[arr.length];
		//System.out.println(arr.length);
		for (int i=0;i<arr.length-1;i++)
		{
			int count = 0;
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==(arr[j]))
						{
							count++;
							
							
						}
				
			}
			if (count>0)
			{
				System.out.println("duplicates----"+arr[i]+"-----"+count+"times");
			}	
			
		}
		
		
		
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={8,3,3,1,8,3};
		
		findupelementts(arr);
		
	

	}

}
