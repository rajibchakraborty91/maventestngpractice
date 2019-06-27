package org.apache.maven.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Altoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("rajib");
		
		al.add("pritam");
		
		al.add("pranab");
		
		System.out.println(al);
		
		//---------------- list to array -------------------------------
		
	
		String[] item = (String[]) al.toArray(new String[al.size()]);
		
		for (String a: item)
		{
			System.out.println(a.toString());
		}
		
		List<String> an = new ArrayList<String>();
		
		//---------------------------- Array as List --------------------------
		
		 an = Arrays.asList(item);
		 
		 System.out.println(an);
		
		 Collections.sort(an);
		 
		 System.out.println(an);

	}

}
