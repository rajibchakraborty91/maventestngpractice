package org.apache.maven.JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashMap hmp = new HashMap();

hmp.put("1", "Rajib");
hmp.put("3", "Mou");
hmp.put("6", "Nav");
hmp.put("8", "Ayan");
hmp.put("12", "Dola");


System.out.println(hmp);



System.out.println(hmp.values().iterator().next());

		
		//Iterator it = hmp.keySet().iterator();
		
		Iterator itmap = hmp.entrySet().iterator();
		
		while(itmap.hasNext())
		{
			//Map.Entry x = (Map.Entry)it.next();
			
			Map.Entry xmap = (Map.Entry)itmap.next();
			
			System.out.println(xmap.getValue()+"------ Value -----------");
			
			System.out.println(xmap.getKey()+"---key---");
			
			hmp.replace(xmap.getValue(), xmap.getKey());
			//hmp.replace(xmap.getKey(), xmap.getKey());
			
			//System.out.println(x.getKey());
			//System.out.println(x.getValue());
			
		}
			System.out.println(hmp);
			
			Set<Map.Entry<String, String>> ss = hmp.entrySet();
			
			for (Map.Entry<String, String> it  : ss)
			{
				System.out.println(it.getKey())
			}
			
			
	}

}
