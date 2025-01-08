package bstackUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyListener implements ITestListener

{
	
	ExtentTest test;
	ExtentReports report = ExtentReporting.startReport();
		
	@Override
    public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
        System.out.println("Test Started: " + result.getName());
        test = report.createTest(result.getName());
       
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	System.out.println("Test Passed");
        System.out.println("Test Passed: " + result.getName());
        test.log(Status.PASS, "test is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        test.log(Status.FAIL, "test is failed"); 
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
    
    public void onFinish(ITestContext context) {
    	report.flush();
    	System.out.println("All tests in the test tag have finished.");
        System.out.println("Passed tests: " + context.getPassedTests().size());
        System.out.println("Failed tests: " + context.getFailedTests().size());
        
    }
	

}
