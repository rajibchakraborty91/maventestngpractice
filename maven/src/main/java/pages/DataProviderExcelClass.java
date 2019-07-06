package pages;

import org.testng.annotations.DataProvider;

public class DataProviderExcelClass {

	@DataProvider(name="fromExcel")
	public Object[][] readfromExcel()
	{
		return new Object[][] {{"hey"},{"yaa"}};
	}
	
	
}
