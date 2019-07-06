package org.apache.maven.JavaPractice;

public class FunctionIntLambda implements Cloneable {

	
	int i=5;
	static int staticvar = 10;
	/*public FunctionIntLambda(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
		
	}*/
	
	public void testme() throws CloneNotSupportedException
	{
	
		FunctionIntLambda f = new FunctionIntLambda();
		
	
	
		//System.out.println(i);
		System.out.println(f.i);
		
		
		FunctionIntLambda s = (FunctionIntLambda)f.clone();

		System.out.println(s.i);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

			
		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
		System.out.println(new Object(){}.getClass().getEnclosingClass());
	//********************** calling functional interface without using lambda----------------------	
		FunctionInterface fold =  new FunctionInterface() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("before java 8 without using lambda");
				System.out.println(new Object(){}.getClass().getEnclosingClass());
			}
		};
		
		fold.show();
		
		//************************ CALLING USING LAMBDA ----------------------
		
		FunctionInterface fnew = () -> System.out.println("after java 8 without using lambda");
		fnew.show();
		
		new FunctionIntLambda().testme();
		
		
		
	}

}
