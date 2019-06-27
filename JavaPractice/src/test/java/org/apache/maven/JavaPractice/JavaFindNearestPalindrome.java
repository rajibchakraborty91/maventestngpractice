package org.apache.maven.JavaPractice;

public class JavaFindNearestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 123;
		
		System.out.println("---nearst palidrome-----");
		
		System.out.println("---nearst palidrome-----"+NearestNumber(x));
		
		
		
	}

	
	public static int NearestNumber(int x)
	{
		
		for (int i =0;;i++)
		{
			
		
			
			int y = x-i;
			
			int w = x+i;
					
			
			if (isPalindrome(y))
			{
					return (x-i);
			}
			if (isPalindrome(w))
			{
				return (x+i);
			}
		}
		
	}
	
	
	public static boolean isPalindrome(int z)
	{
		String rev="";
		int cons =z; 
		
		while (z>=1)
		{
		
		int lastchar = z%10;
		
		z = z/10;
		
		 rev = (Integer.toString(lastchar) + rev);
		}
		
		
		if (rev == Integer.toString(cons))
				{
					return true;
				}
		else
			return false;
	}

}

