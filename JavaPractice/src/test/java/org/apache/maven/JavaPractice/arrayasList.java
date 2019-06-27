package org.apache.maven.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class arrayasList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"61","2","99","80","11"};
		int[] ari = new int[]{1,2,3};
		System.out.println(ari.length);
		Set li = arraytolistconv(arr);
		
		System.out.println(li);
		
	}
	public static Set arraytolistconv(String array[])
	{
		
		//using inbuilt functions -------------------------
		//List li = Arrays.asList(array);
		List li = new ArrayList();
		///Collections.addAll(li, array);
		for (String ss : array)
		{
			li.add(ss);
		}
		
		
		// not sorted...
		System.out.println(li);
		
		Collections.sort(li,Collections.reverseOrder());
		
		///sorted
		
		System.out.println("-----------"+li);
		
		
		//conversion of list to set.
		HashSet hs = new HashSet(li); 
		
		
		
		
		return hs;
		
		
	}
	
	 class sortbyascen implements Comparator<String>
	{

		public int compare(String o1,String o2) {
			// TODO Auto-generated method stub
			return 0;
		}

		
	}
	
}
