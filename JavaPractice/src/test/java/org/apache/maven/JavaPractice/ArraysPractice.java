package org.apache.maven.JavaPractice;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rajib";
		
		String s2= "rajib";
		
		String s3 = new String("dalia");
		
				
		String s4 = new String("dalia");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		String s5 = s3.intern();
		
		String s6 = "dalia";
		
		System.out.println(s5==s6);

	}

}
