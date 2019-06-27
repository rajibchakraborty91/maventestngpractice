package org.apache.maven.JavaPractice;


import java.io.*;
import java.net.*;

interface showme()
{
	 void showmeagain();
}

class testme implements showme
{

	public void showmeagain() {
		// TODO Auto-generated method stub
		System.out.println("print show me");
	}
	
}

public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testme tm = new testme();
		tm.showmeagain();

	}

}
