package org.apache.maven.JavaPractice;

@FunctionalInterface
public interface FunctionInterface {

		void show();
		
	static void showme()
	{
		System.out.println("rajib in interface");
	}

}
