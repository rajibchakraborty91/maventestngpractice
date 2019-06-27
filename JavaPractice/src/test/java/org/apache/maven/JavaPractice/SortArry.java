package org.apache.maven.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArry  {

	public static void sortarray(String[] arr)
	{
		Arrays.sort(arr);
		
		System.out.println(arr[0]+arr[1]+arr[2]);
		
		///----------does not work for strings----------
		
		List<String> li = new ArrayList();
		
				li = Arrays.asList(arr);
		
		System.out.println(li);
		
		Collections.sort(li);
		
		
		
		System.out.println(li);
	Collections.sort(li, Collections.reverseOrder());
		
		System.out.println(li);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] arr = new String[]{"c","a","b","d"};
		
		sortarray(arr);
	}

}
