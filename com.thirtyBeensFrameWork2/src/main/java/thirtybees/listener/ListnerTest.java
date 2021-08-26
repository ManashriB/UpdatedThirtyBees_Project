package thirtybees.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import thirtybees.base.TestBase;
public class ListnerTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		TestBase.Log.info("test case started with execution"+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		TestBase.Log.info("test case passed with execution"+ result.getName());	
		TestBase.test.log(Status.PASS, "test Case passed is "+result.getName());
		//TestBase.extent.flush();
	}

	public void onTestFailure(ITestResult result) {
		TestBase.Log.info("test case failed with execution"+ result.getName());		
		String path =  TestBase.getScreenshot(TestBase.driver, result.getName());
		TestBase.test.log(Status.FAIL, "test Case Failed is "+result.getName());
		TestBase.test.log(Status.FAIL, "test Case Failed is "+result.getThrowable());			
		TestBase.test.log(Status.FAIL,"testcase failed");
		TestBase.test.addScreenCaptureFromPath(path);
		//TestBase.extent.flush();
	} 

	public void onTestSkipped(ITestResult result) {
		TestBase.Log.info("test case skipped with execution"+ result.getName());	
		TestBase.test.log(Status.SKIP, "test Case Skipped is "+result.getName());
		//TestBase.extent.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		TestBase.Log.info("suit is ready to start execution");	
		
	}

	public void onFinish(ITestContext context) {
		TestBase.extent.flush();
		TestBase.Log.info("suit is finish sucessfully"); 
		
	}

	 
	
	
	
	
	
}
