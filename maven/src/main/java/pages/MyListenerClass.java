package pages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;

public class MyListenerClass extends BaseTestNg implements ITestListener {

	
	
@Parameters("parameter_testing")

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test casse execution has been finished");
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getStatus());
	
	}
	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

		public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test case execution has been started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test casse execution has been Passed++++" + ITestResult.FAILURE );

		
	
	}

	
}
