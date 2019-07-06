package org.apache.maven.JavaPractice;




public class FunctionalInterfacea implements FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FunctionalInterfacea().show();
		
		//-----------------interfqce method called
		FunctionInterface.showme();
		
		//--------------class method called
		showme();

	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("rajib");
	}
	//--------------------class method gets priority ----------------
	static void showme()
	{
		System.out.println("rajib in CLASS");
	}

}
