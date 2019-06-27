package org.apache.maven.JavaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class HashCollection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Rajib\\Desktop\\Testing.xlsx"));
		
		XSSFWorkbook wkbk = new XSSFWorkbook(fis);
		
	    XSSFSheet wksht = wkbk.getSheetAt(0);
		
		XSSFRow row = wksht.getRow(1);
		
		XSSFCell cell = wksht.getRow(2).getCell(3);
		
		System.out.println(cell.getRawValue());
		System.out.println(row.getFirstCellNum());
		System.out.println();
		
		fis.close();
		
		HashSet<String> hs = new HashSet();
		int lastrow = wksht.getLastRowNum();
		
		for (int rowc = 1; rowc<=lastrow; rowc++)
			
		{
			for(int colc = 0;colc<row.getLastCellNum();colc++)
			{
				try{
				hs.add(wksht.getRow(rowc).getCell(colc).toString());
				}
				
				catch(NullPointerException ex)
				{
					hs.add("blank");
				}
			}
			
			System.out.println(hs);
		}
	/*	Iterator it = hs.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next().toString());
		}*/
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Columnrow1");
		lhs.add("Columnrow1");
		lhs.add("Columnrow3");
		
		Iterator lit = lhs.iterator();
		
		while (lit.hasNext())
		{
			System.out.println(lit.next().toString());
		}
		
		

	}

}
